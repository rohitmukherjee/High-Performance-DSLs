package systemTestingDSL.outputGenerator

trait HTMLOutputGenerator extends OutputGenerator {

  def had(hadResult: String): Unit = actual(s"Had: $hadResult")

  def expected(expectedResult: String): Unit = expect(s"Expected: $expectedResult")

  def writeToFile(name: String, directory: String, content: String) = super.writeToFile(name, directory, content, ".html")

  def passed = success("Passed")

  def failed = error("Failed")

  def error(errorText: String) = paragraph(errorText, "red")

  def success(successText: String) = paragraph(successText, "green")

  def expect(expectedText: String) = paragraph(expectedText, "blue")

  def actual(actualText: String) = paragraph(actualText, "magenta")

  def log(logText: String) = paragraph(logText, "yellow")

  private def paragraph(content: String, colour: String = "black"): String = (s"""<p style = "color: $colour ;"> $content </p>""")

}