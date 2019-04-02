package ImportsPackages

/**
  * Created by cvikas10 on 4/2/2019.
  */
object pythogorean {
    class RightTriangle {
      def hypotenuse(a:Double,b:Double): Double = {
        Math.sqrt(a*a + b*b)
      }
      def area(a:Double,b:Double): Double={
        (a*b)/2
      }
    }
}