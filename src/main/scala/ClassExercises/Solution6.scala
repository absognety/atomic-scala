package ClassExercises

import javax.print.attribute.standard.PagesPerMinute

object Solution6 {
  def main(args: Array[String]): Unit = {
    class SimpleTimeAux(val hours: Int = 0,
                        val minutes: Int = 0) {
      var Hours = hours
      var Minutes = minutes
      var time = Hours * 60 + Minutes

      def this(hours:Int) {
        this(hours,0)
      }

      def subtract(anotherTime: SimpleTimeAux): SimpleTimeAux = {
        var t2 = anotherTime.time
        if (time > t2) {
          if ((time - t2) % 60 == 0) {
            new SimpleTimeAux(hours = (time - t2) / 60, 0)
          }
          else {
            new SimpleTimeAux((time - t2) / 60, (time - t2) % 60)
          }
        }
        else {
          new SimpleTimeAux(0, 0)
        }
      }
    }
    val auxT1 = new SimpleTimeAux(10, 5)
    val auxT2 = new SimpleTimeAux(6)
    val auxST = auxT1.subtract(auxT2)
    println(auxST.Hours)
    println(auxST.Minutes)
    val auxST2 = new SimpleTimeAux(12).subtract(new SimpleTimeAux(9, 45))
    println(auxST2.Hours)
    println(auxST2.Minutes)
  }
}