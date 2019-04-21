package Overloading

/**
  * Created by cvikas10 on 4/21/2019.
  */
object problem04 {
  def main(args: Array[String]): Unit = {
    class Overloading {
      def f(): Double={0}
      def f(x:Int): Double=x
      def f(x:Int,y:Int): Double={x + y}
      def f(x:Int,y:Int,z:Int): Double={x + y + z}
      def f(x:Int,y:Int,z:Int,w:Int): Double={x + y + z + w}
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
/*
changing the return type as specified in question 4.
 */
//It doesn't matter if you use an explicit return type. Can be either Int or Double.