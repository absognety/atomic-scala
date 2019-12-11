package DefiningOperators

object problem01 {
  def main(args: Array[String]): Unit = {
    class simpleTime2(hours:Int,minutes:Int) {
      var Hours = hours
      var Minutes = minutes
      var time = Hours*60 + Minutes
      def -(anotherTime2:simpleTime2): simpleTime2={
        var t2 = anotherTime2.time
        if (time > t2) {
          if ((time-t2)%60 == 0) {
            new simpleTime2(hours = (time-t2)/60,0)
          }
          else {
            new simpleTime2((time-t2)/60,(time-t2)%60)
          }
        }
        else {
          new simpleTime2(0,0)
        }
      }
    }
    val someT1 = new simpleTime2(10, 30)
    val someT2 = new simpleTime2(9, 30)
    val someST = someT1 - someT2
    println(someST.Hours)
    println(someST.Minutes)
    val someST2 = new simpleTime2(10, 30) - new simpleTime2(9, 45)
    println(someST2.Hours)
    println(someST2.Minutes)
  }
}
