package Map_Reduce

object problem02 {
  def main(args: Array[String]): Unit = {
    val v = Vector(1, 2, 3, 4)
    v.foreach(n => println((n*11) + 10))
  }
}
//unlike map with foreach no value is returned, so println is used to check the results.