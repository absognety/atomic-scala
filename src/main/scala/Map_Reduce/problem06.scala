package Map_Reduce

object problem06 {
  def main(args: Array[String]): Unit = {
    def sumIt(numbers:Int*): Int={
      val total = numbers.reduce((m,n) => m + n)
      total
    }
    println(sumIt(1,2,3))
    println(sumIt(45,45,45,60))
  }
}
