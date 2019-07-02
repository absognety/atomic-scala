package CaseClasses

object Solution6 {
  def main(args: Array[String]): Unit = {
    case class SimpleTimeDefault(val hours:Int = 0,
                                 val minutes:Int = 0) {
      var Hours = hours
      var Minutes = minutes
      var time = Hours*60 + Minutes
      def subtract(anotherTime:SimpleTimeDefault): SimpleTimeDefault={
        var t2 = anotherTime.time
        if (time > t2) {
          if ((time-t2)%60 == 0) {
            SimpleTimeDefault(hours = (time-t2)/60,0)
          }
          else {
            SimpleTimeDefault((time-t2)/60,(time-t2)%60)
          }
        }
        else {
          SimpleTimeDefault(0,0)
        }
      }
    }
    val anotherT1 = SimpleTimeDefault(10, 30)
    val anotherT2 = SimpleTimeDefault(9)
    val anotherST =
      anotherT1.subtract(anotherT2)
    println(anotherST.Hours)
    println(anotherST.Minutes)
    val anotherST2 = SimpleTimeDefault(10).
      subtract(SimpleTimeDefault(9, 45))
    println(anotherST2.Hours)
    println(anotherST2.Minutes)
  }
}
