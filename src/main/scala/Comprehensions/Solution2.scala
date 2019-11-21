package Comprehensions

object Solution2 {
  def main(args: Array[String]): Unit = {
    def yielding2(v:List[Int]):List[Int]={
      for {
        n <- v
        if n < 10
        isOdd = n % 2 != 0
        if isOdd
      } yield n
    }
    val v = List(1,2,3,5,6,7,8,10,13,14,17)
    println(yielding2(v))
  }
}
