package FunctionsAsObjects

object Solution7 {
  def main(args: Array[String]): Unit = {
    var s = ""
    val v = Vector(1,2,5,3,7)
    v.foreach(n => s = s + (n*n).toString + " ")
    println(s)
  }
}
