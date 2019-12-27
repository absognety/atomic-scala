package Inheritance

object problem03 {
  def main(args: Array[String]): Unit = {
    class Cycle {
      val wheels = 2
      def ride = "Riding"
    }
    class Bicycle extends Cycle
    val c = new Cycle
    println(c.ride)
    val b = new Bicycle
    println(b.ride)
    println(b.wheels)
  }
}
