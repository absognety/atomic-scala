package FunctionsAsObjects

object Solution3 {
  def main(args: Array[String]): Unit = {
    val dogYears = (x:Int) => x*7
    println(dogYears(10))
    println(dogYears(12))
  }
}
