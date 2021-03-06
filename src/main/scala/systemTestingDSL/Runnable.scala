package systemTestingDSL

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.sys.process._
import scala.concurrent.Await
import scala.concurrent.duration._
import java.util.concurrent.TimeoutException
import com.typesafe.config.ConfigFactory
import java.io.FileNotFoundException

/**
 * This trait models anything that is runnable. It only depends on the config object for a TIMEOUT value which states how long
 * the executable is supposed to run for on the OS
 */
trait Runnable {
  def commandName: String
  def fileName: String
  def arguments: String
  def outputFileName: String
  val separator: String = SPACE

  def formCommand: String

  private def executeInner: String = {
    val cmd = formCommand
    val timeout: Int = ConfigFactory.load().getInt("TIMEOUT")
    val executeFuture: Future[String] = Future {
      println(cmd)
      val result: String = cmd.!!
      result
    }
    try {
      Await.result(executeFuture, timeout seconds)
    } catch {
      case ex: TimeoutException => return "The above computation timed out"
      case ex: FileNotFoundException => "The file could not be found, please check the executable paths"
    }
  }

  def execute: (String, Long) = {
    var endTime: Long = 0
    var startTime = System.currentTimeMillis
    val result = executeInner
    endTime = System.currentTimeMillis
    (result, endTime - startTime)
  }

}
