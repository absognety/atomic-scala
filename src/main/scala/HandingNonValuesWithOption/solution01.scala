package HandingNonValuesWithOption

object solution01 {
  def f(i:Int) = {
    if (i == 0) {None}
    else {Some(24/i)}
  }
  def test(n:Int) =
    f(n) match {
      case None => s"Failed: Divide by zero"
      case Some(x) => x
    }

  def main(args: Array[String]): Unit = {
    println (test(4))
    println (test(5))
    println (test(6))
    println (test(0))
    println (test(24))
    println (test(25))
  }
}
