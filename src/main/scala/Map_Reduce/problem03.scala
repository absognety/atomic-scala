package Map_Reduce

object problem03 {
  def main(args: Array[String]): Unit = {
    val v = Vector(1, 2, 3, 4)
    for (i <- v) {
      println((i*11) + 10)
    }
  }
}
//for is more complex compared to map, but less prone to errors.
