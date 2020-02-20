package HandingNonValuesWithOption

object solution02 {
  def fnew(i:Int): Option[Int] = {
    if (i == 0) {None}
    else {Some(24/i)}
  }
  def testnew(n:Int): Any =
    fnew(n) match {
      case None => s"Failed: Divide by zero"
      case Some(x) => x
    }
  def main(args: Array[String]): Unit = {
    println (testnew(4))
    println (testnew(5))
    println (testnew(6))
    println (testnew(0))
    println (testnew(24))
    println (testnew(25))
  }
}
