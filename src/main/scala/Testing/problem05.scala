package Testing

/**
  * Created by cvikas10 on 4/6/2019.
  */
object problem05 {
  def main(args: Array[String]): Unit = {
    class areaOfQuadrangle {
      def squareArea(x:Int): Int={
        x * x
      }
      def rectangleArea(x:Int,y:Int): Int={
        x * y
      }
      def trapezoidArea(x:Double,y:Double,h:Double): Double={
        h/2 * (x + y)
      }
    }
    val area = new areaOfQuadrangle
    println(area.squareArea(1))
    println(area.squareArea(2))
    println(area.squareArea(5))
    println(area.rectangleArea(2,2))
    println(area.rectangleArea(5,4))
    println(area.trapezoidArea(2,2,4).toInt)
    println(area.trapezoidArea(3,4,1))
  }
}
