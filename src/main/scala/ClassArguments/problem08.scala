package ClassArguments

/**
  * Created by cvikas10 on 4/20/2019.
  */
object problem08 {
  def main(args: Array[String]): Unit = {
    class cup2(percentFull:Int) {
      var max = 100
      var min = 0
      var result = percentFull
      def add(temps:Int*): Int={
        for (temp <- temps) {
          result += temp
        }
        if (result > max) {
          result = max
        }
        if (result < min) {
          result = min
        }
        result
      }
    }
    val cup5 = new cup2(0)
    println(cup5.add(20,30,50,20,10,-10,-40,10,50))
    val cup6 = new cup2(10)
    println(cup6.add(20,20,40,-45,-42))
  }
}
