package Vectors

/**
  * Created by cvikas10 on 4/6/2019.
  */
object problem02 {
  def main(args: Array[String]): Unit = {
    val W = Vector(Vector(1,2,3),Vector(4,5,6),Vector(7,8,9))
    println(W(1))
    println(W(0))
    println(W(2))
    println(W(0)(2))
    println(W(2)(2))
  }
}
