package Map_Reduce

object problem01 {
  def main(args: Array[String]): Unit = {
    val v = Vector(1, 2, 3, 4)
    val u = v.map(n => (n*11) + 10)
    println(u)
  }
}
