package DefiningOperators
import scala.math.pow

object problem02 {
  def main(args: Array[String]): Unit = {
    class FancyNumber1(num:Int) {
      val number = num
      def power(N:Int) = {pow(num,N)}
    }
    val fancyNumber = new FancyNumber1(2)
    println(fancyNumber.power(3).toLong)
    val b1 = new FancyNumber1(10)
    println(b1.power(2).toLong)
  }
}
