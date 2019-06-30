package ClassExercises

object Solution4 {
  def main(args: Array[String]): Unit = {
    class simpleTime(hours:Int,minutes:Int) {
      var Hours = hours
      var Minutes = minutes
      var time = Hours*60 + Minutes
      def subtract(anotherTime:simpleTime): simpleTime={
        var t2 = anotherTime.time
        if (time > t2) {
          if ((time-t2)%60 == 0) {
            new simpleTime(hours = (time-t2)/60,0)
          }
          else {
            new simpleTime((time-t2)/60,(time-t2)%60)
          }
        }
        else {
          new simpleTime(0,0)
        }
      }
    }
    val t1 = new simpleTime(10, 30)
    val t2 = new simpleTime(9,30)
    val st = t1.subtract(t2)
    println(st.Hours)
    println(st.Minutes)
    val st2 = new simpleTime(10, 30).
      subtract(new simpleTime(9, 45))
    println(st2.Hours)
    println(st2.Minutes)
    val st3 = new simpleTime(9, 30).
      subtract(new simpleTime(10, 0))
    println(st3.Hours)
    println(st3.Minutes)
  }
}

/* OUTPUT_SHOULD_BE
1
0
0
45
0
0
*/