package ErrorReportingWithEither

object problem01 {
  def f(i:Int): Either[String,Int] =
    if(i == 0)
      Left("Divide by zero")
    else
      Right(24/i)

  def test(n:Int): Any =
    f(n) match {
      case Left(why) => s"Failed: $why"
      case Right(result) => result
    }

  def main(args: Array[String]): Unit = {
    println (test(4),test(5),test(6),
      test(0),test(24),test(25))
  }
}
