package ClassExercises

object Solution7 {
  def main(args: Array[String]): Unit = {
    class SimpleTimeNamed (val hours:Int = 0,
                           val minutes:Int = 0) {
      var time = hours*60 + minutes
      def subtract(anotherTime:SimpleTimeNamed): SimpleTimeNamed={
        var t2 = anotherTime.time
        if (time > t2) {
          if ((time-t2)%60 == 0) {
            new SimpleTimeNamed(hours = (time-t2)/60,0)
          }
          else {
            new SimpleTimeNamed((time-t2)/60,(time-t2)%60)
          }
        }
        else {
          new SimpleTimeNamed(0,0)
        }
      }
    }
    val namedST = new SimpleTimeNamed(hours=9)
    val anotherNamedST = new SimpleTimeNamed(minutes=30)
    println(namedST.hours)
    println(namedST.minutes)
    println(anotherNamedST.hours)
    println(anotherNamedST.minutes)
  }
}
