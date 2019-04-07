package MoreConditionals

/**
  * Created by cvikas10 on 4/7/2019.
  */
object problem01 {
  def main(args: Array[String]): Unit = {
    val X = Vector(1,1,1,1,1,1,1,1)
    val Y = X.reverse
    println(Y)
    assert(X==Y)
  }
}
//when all the elements of a vector are equal, the reverse is equal to the original.