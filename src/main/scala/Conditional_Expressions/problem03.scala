package Conditional_Expressions

/**
  * Created by cvikas10 on 3/24/2019.
  */
object problem03 {
  def main(args: Array[String]): Unit = {
    val a:Int = 1
    val b:Int = 5
    val c:Int = 5
    if (a < c){
      println("a is less than c")
    } else {
      println("a is not less than c")
    }
    if (b < c){
      println("b is less than c")
    } else {
      println("b is not less than c")
    }
  }
}
