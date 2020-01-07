package UniformAccessandSetters

object problem02 {
  class Base {
    def f1:Int = 1
    def f2:Int = 1
    val d1:Int = 1
    val d2:Int = 1
    var d3:Int = 1
    var n=1
  }
  class Derived extends Base
  def main(args: Array[String]): Unit = {
    val d = new Derived
    println(d.d3)
    d.d3 = 42
    println(d.d3)
  }
}
