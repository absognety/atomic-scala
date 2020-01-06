package AbstractClasses

object solution03 {
  abstract class Adder(x:Int) {
    def add(y:Int):Int
  }
  class NumericAdder(val x:Int) extends Adder(x) {
    override def add(y: Int): Int = (x + y)
  }

  def main(args: Array[String]): Unit = {
    val num = new NumericAdder(5)
    println (num.add(10))
    println(num.add(20))
  }
}
