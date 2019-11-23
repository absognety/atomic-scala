package PatternMatchingWithTypes

object Solution4 {
  def main(args: Array[String]): Unit = {
    def quantify(x:Int): String={
      if (x < 100){
        "small"
      } else if ((x >= 100) && (x <= 1000)) {
        "medium"
      } else {
        "large"
      }
    }
    println(quantify(100))
    println(quantify(20.56.toInt))
    println(quantify(100000))
    println(quantify(-15999))
  }
}
