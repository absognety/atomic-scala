package ClassExercises

object Solution5 {
  def main(args: Array[String]): Unit = {
    class SimpleTimeDefault(val hours:Int = 0,
                            val minutes:Int = 0) {
      var Hours = hours
      var Minutes = minutes
      var time = Hours*60 + Minutes
      def subtract(anotherTime:SimpleTimeDefault): SimpleTimeDefault={
        var t2 = anotherTime.time
        if (time > t2) {
          if ((time-t2)%60 == 0) {
            new SimpleTimeDefault(hours = (time-t2)/60,0)
          }
          else {
            new SimpleTimeDefault((time-t2)/60,(time-t2)%60)
          }
        }
        else {
          new SimpleTimeDefault(0,0)
        }
      }
    }
    val anotherT1 =
      new SimpleTimeDefault(10, 30)
    val anotherT2 = new SimpleTimeDefault(9)
    val anotherST =
      anotherT1.subtract(anotherT2)
    println(anotherST.Hours)
    println(anotherST.Minutes)
    val anotherST2 = new SimpleTimeDefault(10).
      subtract(new SimpleTimeDefault(9, 45))
    println(anotherST2.Hours)
    println(anotherST2.Minutes)
  }
}
