package CompanionObjects
import scala.math.round

object Solution4 {
  def main(args: Array[String]): Unit = {
    class WalkActivity4 {
      def calories(lbs:Int, mins:Int,
                   mph:Double=3): Long = round(
        (WalkActivity4.MET(mph) * 3.5 * lbs * 0.45)/200.0 * mins
      )
    }
    object WalkActivity4 {
      def MET(mph: Double) = mph match {
        case x if (x < 1.7) => 2.3
        case x if (x < 2.5) => 2.9
        case x if (x < 3) => 3.3
        case x if (x >= 3) => 3.3
        case _ => 2.3
      }
    }
    println(WalkActivity4.MET(1.0))
    println(WalkActivity4.MET(2.7))
    val suzie = new WalkActivity4
    println (suzie.calories(150,30))
    val john = new WalkActivity4
    println(john.calories(150, 30, 1.5))
  }
}
