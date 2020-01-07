package UniformAccessandSetters

object problem01 {
  abstract class Base {
    def f1:Int
    def f2:Int
    val d1:Int
    val d2:Int
    var d3:Int
    var n=1
  }
  class Derived extends Base {
    def f1 = 1
    val f2 = 1 // Was def, now val
    val d1 = 1
    // Can't do this; must be a val:
    // def d2 = 1
    val d2 = 1
    def d3 = n
    def d3_=(newVal:Int) = n = newVal
  }

  def main(args: Array[String]): Unit = {
    val d = new Derived
    println(d.d3)
    d.d3 = 42
    println(d.d3)
  }
}
//it also works for abstract class in place of trait