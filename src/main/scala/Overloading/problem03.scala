package Overloading

/**
  * Created by cvikas10 on 4/21/2019.
  */
object problem03 {
  def main(args: Array[String]): Unit = {
    class Overloading {
      def f(): Int={0}
      def f(x:Int): Int=x
      def f(x:Int,y:Int): Int={x + y}
      def f(x:Int,y:Int,z:Int): Int={x + y + z}
      def f(x:Int,y:Int,z:Int,w:Int): Int={x + y + z + w}
    }
    val mo = new Overloading
    println(mo.f())
    println(mo.f(1))
    println(mo.f(1,2))
    println(mo.f(1,2,3))
    println(mo.f(1,2,3,4))
  }
}
//Overloading can be done within a class but not directly in a main function

