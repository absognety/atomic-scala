package Vectors

/**
  * Created by cvikas10 on 4/6/2019.
  */
object problem11 {
  def main(args: Array[String]): Unit = {
    val yList = List("hello","what","are","you","doing")
    val ySet = Set("hello","what","are","you","doing")
    println(yList)
    println(ySet)
    println(yList.sorted)
    println(yList.reverse)
  }
}
//sorted and reverse methods are not applicable on Set in scala.