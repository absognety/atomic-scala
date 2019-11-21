package Map_Reduce

object problem05 {
  def main(args: Array[String]): Unit = {
    val v = Vector(1, 10, 100, 1000)
    var sum = 0
    for (s <- v) {
      sum += s
    }
    println(sum)
  }
}
