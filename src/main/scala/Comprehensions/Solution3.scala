package Comprehensions

object Solution3 {
  def main(args: Array[String]): Unit = {
    def yielding3(v:Vector[Int]):Vector[Int]= {
      var result = Vector[Int]()
      for {
        n <- v
        if n < 10
        isOdd = n % 2 != 0
        if isOdd
      } result = result :+ (n * 10) + 2
      result
    }
    val v = Vector(1,2,3,5,6,7,8,10,13,14,17)
    println(yielding3(v))
  }
}
