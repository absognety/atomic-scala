package ConvertingExceptionsWithTry
import util.{Try,Success}
import ConvertingExceptionsWithTry.errors._

object solution01 {
  def f(n:Int) = Try(toss(n)).transform(
    i => Success(s"$i Bob"), // Success
    e => e match { // Failure
      case Except1(why) => Success(why)
      case Except2(n) => Success(n)
      case Except3(msg, d) => Success(d)
    }
  ).get

  def main(args: Array[String]): Unit = {
    println (f(0))
    println (f(1))
    println (f(2))
    println (f(3))
  }
}
