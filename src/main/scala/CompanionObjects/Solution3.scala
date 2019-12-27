package CompanionObjects
import scala.math.round
object Solution3 {
  def main(args: Array[String]): Unit = {
    class WalkActivity3 {
      val calories = WalkActivity3.calories(150,30)
    }
    object WalkActivity3 {
      val MET = 2.3
      def calories(lbs:Int, mins:Int,
                   mph:Double=3): Long = round(
        (MET * 3.5 * lbs * 0.45)/200.0 * mins
      )
    }
    val sally = new WalkActivity3
    println(sally.calories)
  }
}
