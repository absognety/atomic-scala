package AbstractClasses

object solution04 {
  abstract class Adder(x:Int) {
    val check_entry = 0
    def add(y:Int):Boolean
  }
  case class NumericAdder(val x:Int) extends Adder(x) {
    override def add(y: Int): Boolean = {if (y > 0) true else false}
  }
  def main(args: Array[String]): Unit = {
    val num = NumericAdder(5)
    println (num.add(10))
    println(num.add(-20))
    println(num.check_entry)
  }
}
