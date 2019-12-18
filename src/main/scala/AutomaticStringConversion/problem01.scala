package AutomaticStringConversion

object problem01 {
  def main(args: Array[String]): Unit = {
    case class Bicycle(riders:Int) {
      override def toString = s"Bicycle built for $riders"
    }
    val forTwo = Bicycle(2)
    println(forTwo)
  }
}
