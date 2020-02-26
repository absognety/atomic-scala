package CustomErrorReporting

import codelistingeither._
import codelistingtester._
import scala.util.{Success,Failure}
object exercise01 {
  def listing(name:String) = {
    CodeListingEither(name) match {
      case Success(lines) => lines
      case Failure(f:customException) => Vector(f.getMessage).mkString("")
    }
  }

  def main(args: Array[String]): Unit = {
    println (listing("CodeListingTester.scala"))
    println (listing("NotAFile.scala"))
    println (listing("NotAScalaFile.txt"))
    println (listing(null))
  }
}
