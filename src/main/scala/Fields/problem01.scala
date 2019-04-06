package Fields

/**
  * Created by cvikas10 on 4/6/2019.
  */
object problem01 {
  def main(args: Array[String]): Unit = {
    class cup2 {
      var percentFull=0
      val max = 100
      def add(Increase:Int): Int={
        percentFull += Increase
        if (percentFull > max) {
          percentFull = max
        }
        percentFull
      }
    }
    val myCup = new cup2
    println(myCup.add(45))
    println(myCup.add(-15))
    println(myCup.add(-30))
  }
}
