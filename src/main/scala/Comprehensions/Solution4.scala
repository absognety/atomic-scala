package Comprehensions

object Solution4 {
  var isOdd:Boolean = false
  var n:Int = 0
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
//found a way to do this, but the var isOdd and var n should be declared
//at the beginning before main.