package FunctionsAsObjects

object Solution5 {
  def main(args: Array[String]): Unit = {
    var s = ""
    val v = Vector(1, 5, 7, 8)
    v.foreach(n => s = s + (n*7).toString + " ")
    println(s)
  }
}
