package Fields

/**
  * Created by cvikas10 on 4/6/2019.
  */
object problem02 {
  def main(args: Array[String]): Unit = {
    class cup3 {
      var percentFull=0
      val max = 100
      def add(Increase:Int): Int={
        percentFull += Increase
        if (percentFull > max) {
          percentFull = max
        }
        if (percentFull < 0) {
          percentFull = 0
        }
        percentFull
      }
    }
    val Cup3 = new cup3
    println(Cup3.add(45))
    println(Cup3.add(-55))
    println(Cup3.add(10))
    println(Cup3.add(-9))
    println(Cup3.add(-2))
  }
}
