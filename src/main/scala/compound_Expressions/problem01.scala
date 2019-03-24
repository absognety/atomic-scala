package compound_Expressions

/**
  * Created by cvikas10 on 3/24/2019.
  */
object problem01 {
  def main(args: Array[String]): Unit = {
    val a = 1
    val b = 5
    val c = 4
    val isLess = {
      if (a <= c){
        "a is less than c"
      } else {
        "a is not less than c"
      }
    }
    println(isLess)
  }
}
