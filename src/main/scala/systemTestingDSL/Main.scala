package systemTestingDSL

import com.typesafe.config.ConfigFactory

object Main {

  def main(args: Array[String]): Unit = {
    val command = args(0)
    command match {
      case "sleek" => runSleekTests
      case "hip" => runHipTests
      case "all" => runAllTests
      case "buildReference" => buildReference
      case "runReference" => runReference
      case _ => showHelpText
    }
  }

  private def runAllTests(): Unit = {
    runSleekTests
    runHipTests
  }

  private def runReference(): Unit = {
    printHeader("Running Reference Tests")
    new ReferenceTestRunner(ConfigFactory.load()).run
  }
  private def buildReference(): Unit = {
    printHeader("Building References")
    new RegressionTestReferenceBuilder(ConfigFactory.load()).run

  }
  private def runSleekTests(): Unit = {
    printHeader("Running Sleek Tests")
    new SleekTestSuiteUsage(ConfigFactory.load()).run()
  }

  private def runHipTests(): Unit = {
    printHeader("Running Hip Tests")
    new HipTestSuiteUsage(ConfigFactory.load()).run()
  }

  private def runSVCompTests(): Unit = {
    printHeader("Running SVComp Tests")
  }

  private def showHelpText(): Unit = {
    println(error("Supported Options: sbt run [sleek/hip/all]"))
  }

  private def printHeader(header: String) = {
    println(success("******************"))
    println(success(header))
    println(success("******************"))
  }

  private def error(errorText: String): String = Console.CYAN + errorText + Console.RESET + '\n'

  private def success(successText: String): String = Console.GREEN + successText + Console.RESET + '\n'

}
