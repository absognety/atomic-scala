package IdiomaticScala

object Solution2 {
  def main(args: Array[String]): Unit = {
    var result = ""
    for(i <- 0 to 9) result += i + " "
    println(result)
    //result is "0 1 2 3 4 5 6 7 8 9 "
    result = ""
    for(i <- 0 until 10) result += i + " "
    println(result)
    //result is "0 1 2 3 4 5 6 7 8 9 "
    result = ""
    for(i <- Range(0, 10)) result += i + " "
    println(result)
    //result is "0 1 2 3 4 5 6 7 8 9 "
  }
}
