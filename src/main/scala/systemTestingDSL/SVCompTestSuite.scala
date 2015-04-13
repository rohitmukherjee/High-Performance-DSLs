package systemTestingDSL

import scala.collection.mutable.HashMap

case class SVCompTestSuite(directory: String,
  arguments: String = """-infer "@term" --svcomp-compete""",
  fileType: String = ".c") extends GetFileList {

  def buildResultMap(): HashMap[String, String] = {
    val files = getFileList(directory, fileType)
    var resultMap = new HashMap[String, String]()
    files.foreach(file => resultMap.put(file, getResultFromFileName(extractFileNameFromPath(file))))
    resultMap
  }
  def getResultFromFileName(fileName: String): String = {
    if (fileName.contains("true") || fileName.contains("TRUE"))
      "TRUE"
    else if (fileName.contains("false") || fileName.contains("FALSE"))
      "FALSE"
    "UNKNOWN"
  }

  def extractFileNameFromPath(path: String): String = {
    path.substring(path.lastIndexOf("/") + 1)
  }

  def runAllTests(): Unit = {
    buildResultMap().foreach(println(_))
  }

}