package Vectors

/**
  * Created by cvikas10 on 4/6/2019.
  */
object problem07 {
  def main(args: Array[String]): Unit = {
    val intVector = Vector(1,2,3,4,5,6,7,8,9,10)
    val doubleVector = Vector(1.5,2.6,3.9,4.99,5,7.81,10.45)
    println(intVector.max)
    println(intVector.min)
    println(intVector.sum)
    println(doubleVector.max)
    println(doubleVector.min)
    println(doubleVector.sum)
  }
}
