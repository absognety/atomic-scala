package AutomaticStringConversion

object Solution03 {
  def main(args: Array[String]): Unit = {
    case class Cycle(wheels:Int) {
      def returnCond(): String={
        wheels match {
          case 1 => "Unicycle"
          case 2 => "Bicycle"
          case 3 => "Tricycle"
          case 4 => "Quadricycle"
          case x if x >= 5 => s"Cycle with $wheels wheels"
          case x if x < 0 => "That's not a cycle!"
        }
      }
    }
    val c1 = Cycle(1)
    println(c1.returnCond())
    val c2 = Cycle(2)
    println(c2.returnCond())
    val c3 = Cycle(3)
    println(c3.returnCond())
    val c4 = Cycle(4)
    println(c4.returnCond())
    val cN = Cycle(6)
    println(cN.returnCond())
    val cminusN = Cycle(-2)
    println(cminusN.returnCond())
  }
}
