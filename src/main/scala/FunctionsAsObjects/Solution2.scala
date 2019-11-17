package FunctionsAsObjects

object Solution2 {
  def main(args: Array[String]): Unit = {
    var str = ""
    val v = Vector(1, 2, 3, 4)
    v.foreach(n => str = str + n + ",")
    println(str)
  }
}
