package FunctionsAsObjects

object Solution4 {
  def main(args: Array[String]): Unit = {
    var s = ""
    val v = Vector(1, 5, 7, 8)
    val dogYears = (x:Int) => x*7
    v.foreach(n => s = s + dogYears(n).toString + " ")
    println(s)
  }
}
