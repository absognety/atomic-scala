package ErrorHandlingWithExceptions

case class exceptTest(sample:String) extends Exception(sample)

object toss {
  def apply(which: String) =
    which match {
      case "1" => throw exceptTest("Reason")
      case "2" => throw exceptTest("2")
      case "3" =>
        throw exceptTest("3,Three")
      case _ => "OK"
    }
}
object problem01 {
  import toss._
  def testMethod(s:String) = {
    try {
      apply(s)
    } catch {
      case exceptTest("Reason") => "exception: Reason"
      case exceptTest("2") => "exception: Integer"
      case exceptTest("3") => "exception: Integer 3"
      case exceptTest("3,Three") => "exception: Number in words"
    }
  }

  def main(args: Array[String]): Unit = {
    println (testMethod("Reason"))
    println (testMethod("1"))
    println (testMethod("2"))
    println (testMethod("3"))
    println (testMethod("four"))
  }
}
