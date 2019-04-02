package ImportsPackages
import Math._

/**
  * Created by cvikas10 on 4/2/2019.
  */
object problem02 {
  def main(args: Array[String]): Unit = {
    class EquilateralTriangle {
      def area(side: Double): Double = {
        var x = sqrt(3)
        x / 4 * (side * side)
      }
    }
    val triangle = new EquilateralTriangle
    println(triangle.area(4))
    println(triangle.area(20))
    println(triangle.area(2))
  }
}

/*
6.928203230275509
173.20508075688772
1.7320508075688772
 */
