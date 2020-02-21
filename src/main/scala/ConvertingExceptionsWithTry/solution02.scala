package ConvertingExceptionsWithTry
import util.{Try,Success}
import errors._
object solution02 {
  def f1(n:Int) = Try(toss(n)).transform(
    i => Success(s"$i Bob"), // Success
    e => e match { // Failure
      case Except1(why) => Success(why)
      case Except2(n) => Success(n)
      case Except3(msg, d) => Success(d)
    }
  )

  def main(args: Array[String]): Unit = {
    println (f1(0))
    println (f1(0).get)
    println ("\n")
    println (f1(1))
    println (f1(1).get)
    println ("\n")
    println (f1(2))
    println (f1(2).get)
    println ("\n")
    println (f1(3))
    println (f1(3).get)
  }
}
