package TypeParameterConstraints

object problem03 {
  class Base {
    override def toString = "Base"
  }
  class Derived extends Base {
    override def toString = "Derived"
  }
  class Most extends Derived {
    override def toString = "Most"
  }
  def f1[T <: Base](t:T) = "f1 " + t.toString
  def f2[T <: Derived](t:T) = "f2 " + t.toString
  def f3[T <: Most](t:T) = "f3 " + t.toString

  def main(args: Array[String]): Unit = {
    println (f1(new Base))
    println (f2(new Derived))
    println (f3(new Most))
    println (f2(new Most))
    println (f1(new Derived))
    println (f1(new Most))
    //println (f2(new Base)) => will lead to exception
    //println (f3(new Base)) => exception
    //println (f3(new Derived)) => exception
  }
}
