package systemTestingDSL

import scala.collection.mutable.MutableList
import java.io.File
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.HashMap
import systemTestingDSL.outputGenerator.ConsoleOutputGenerator

class HipTestCaseBuilder {
  var commandName: String = ""
  var fileName: String = ""
  var arguments: String = ""
  var outputDirectory: String = ""
  var outputFileName: String = ""
  var expectedOutput: String = ""
  var regex: String = "Procedure.*FAIL.*|Procedure.*SUCCESS.*"

  def runCommand(commandName: String): HipTestCaseBuilder = {
    this.commandName = commandName
    this
  }

  def onFile(fileName: String): HipTestCaseBuilder = {
    this.fileName = fileName
    this
  }

  def withArguments(arguments: String): HipTestCaseBuilder = {
    this.arguments = arguments
    this
  }

  def storeOutputInDirectory(outputDirectory: String): HipTestCaseBuilder = {
    this.outputDirectory = outputDirectory
    this
  }

  def withOutputFileName(outputFileName: String): HipTestCaseBuilder = {
    this.outputFileName = outputFileName
    this
  }

  def checkAgainst(expectedOutput: String): HipTestCaseBuilder = {
    this.expectedOutput = expectedOutput
    this
  }

  def usingRegex(regex: String): HipTestCaseBuilder = {
    this.regex = regex
    this
  }

  def build: HipTestCase = new HipTestCase(this)
}
class HipTestCase(builder: HipTestCaseBuilder)
    extends Runnable with Parser with ConsoleOutputGenerator {
  var commandName = builder.commandName
  var fileName = builder.fileName
  var arguments = builder.arguments
  var outputFileName = builder.outputFileName
  var expectedOutput = builder.expectedOutput
  var outputDirectory = builder.outputDirectory
  var regex = builder.regex
  var output: (String, Long) = ("", 0)

  var results: MutableList[String] = MutableList()
  def process(source: String, rule: String): Unit = {
    results += rule
  }

  def buildExpectedOutputMap(results: String): HashMap[String, String] = {
    val outputMap = new HashMap[String, String]
    results.split(",").foreach(result => outputMap.put(result.substring(0, result.indexOf(":")).trim, result.substring(result.indexOf(":") + 1).trim))
    outputMap
  }

  def run() = {
    this.output = this.execute
    if (outputFileName.length > 0)
      writeToFile(this.outputFileName, this.outputDirectory, output._1)
  }

  def printResults() = {
    for (result <- results)
      println(result + ", ")
    print("end of results")
  }

  def generateOutput() = {
    run
    this.parse(this.output._1, builder.regex, NEW_LINE)
    generateTestResult()
  }

  def checkResults(expectedOutput: String, result: String): (Option[String], Boolean) = {
    val expectedOutputMap = buildExpectedOutputMap(result)
    var resultOutput = ""
    val filteredResults = results.view.filter(_.matches(this.regex))
    if (filteredResults.isEmpty)
      return (Some("Binary failed to execute. Please investigate \n"), false)
    for (outputLine <- filteredResults) {
      var methodName = outputLine.split(" ")(1)
      methodName = methodName.substring(0, methodName.indexOf("$"))
      val result: String = if (outputLine.contains("FAIL"))
        "FAIL"
      else "SUCCESS"
      if (expectedOutputMap.contains(methodName) && !expectedOutputMap(methodName).equals(result)) {
        resultOutput += had(result)
        resultOutput += expected(expectedOutputMap(methodName))
        return (Some(resultOutput), false)
      }
    }
    return (None, true)
  }

  def generateTestResult(): (Option[String], String, Long) = {
    val results = checkResults(expectedOutput, this.expectedOutput)
    if (results._2)
      (None, "Passed", output._2)
    else (results._1, "Failed", output._2)
  }
}