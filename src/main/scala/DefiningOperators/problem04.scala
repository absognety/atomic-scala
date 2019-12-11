package DefiningOperators
import scala.math.pow

object problem04 {
  def main(args: Array[String]): Unit = {
    class FancyNumber1(num:Int) {
      val number = num
      def **(N:Int) = {pow(num,N)}
    }
    val fancyNumber = new FancyNumber1(2)
    println(fancyNumber.**(3).toLong)
    val b1 = new FancyNumber1(10)
    println((b1**2).toLong)
  }
}
