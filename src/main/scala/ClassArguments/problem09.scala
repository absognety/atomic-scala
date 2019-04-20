package ClassArguments

/**
  * Created by cvikas10 on 4/20/2019.
  */
object problem09 {
  def main(args: Array[String]): Unit = {
    def sumOfSquares(nums:Int*): Int={
      var SUM = 0
      for (n <- nums) {
        SUM += (n*n)
      }
      return (SUM)
    }
    println(sumOfSquares(1,2))
    println(sumOfSquares(1,2,4))
    println(sumOfSquares(2,4))
  }
}
