package ClassArguments

/**
  * Created by cvikas10 on 4/20/2019.
  */
object problem06 {
  def main(args: Array[String]): Unit = {
    class cup2(percentFull:Int) {
      val max = 100
      var result = percentFull - percentFull
      def add(Increase:Int): Int={
        result += Increase
        if (result > max) {
          result = max
        }
        result
      }
    }
    val myCup = new cup2(46)
    //myCup.percentFull = 90 - no we cannot set the value here like this.
    println(myCup.add(45))
    println(myCup.add(-15))
    println(myCup.add(-30))
    println(myCup.add(99))
  }
}
