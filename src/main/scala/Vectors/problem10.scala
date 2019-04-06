package Vectors

/**
  * Created by cvikas10 on 4/6/2019.
  */
object problem10 {
  def main(args: Array[String]): Unit = {
    val xList = List(1,2,3,4,5)
    val xSet = Set(1,2,3,4,5)
    val xVector = Vector(1,2,3,4,5)
    println(xList.max)
    println(xList.min)
    println(xList.sum)
    println("\n")
    println(xSet.max)
    println(xSet.min)
    println(xSet.sum)
    println("\n")
    println(xVector.max)
    println(xVector.min)
    println(xVector.sum)
  }
}
//The Operations on List, Set and Vector do the same task.