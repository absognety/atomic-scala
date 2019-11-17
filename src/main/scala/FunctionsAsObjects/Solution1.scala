package FunctionsAsObjects

object Solution1 {
  def main(args: Array[String]): Unit = {
    var str = ""
    val v = Vector(1, 2, 3, 4)
    v.foreach(n => str = str + n)
    println(str)
  }
}
