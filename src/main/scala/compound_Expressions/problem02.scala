package compound_Expressions

/**
  * Created by cvikas10 on 3/24/2019.
  */
object problem02 {
  def main(args: Array[String]): Unit = {
    val a = 1
    var b = 6
    val c = 5
    var isCheck = {
      if (a <= c && b <= c){
        "Both are!"
      }else if (a <= c && b > c){
        "one is and one isn't"
      }else if (b <= c && a > c){
        "one is and one isn't"
      }else if (a > c && b > c){
        "Both aren't"
      }
    }
    println(isCheck)
  }
}
