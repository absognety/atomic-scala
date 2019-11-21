package FunctionsAsObjects

object Solution6 {
  def main(args: Array[String]): Unit = {
    def tempAnonymous(temperature:Int,
                      low:Int,
                      high:Int): Boolean={
      if ((temperature > low) & (temperature < high)) {
        true
      } else { false }
    }
    val boolTemp1 = tempAnonymous(70,80,90)
    println(boolTemp1)
    val boolTemp2 = tempAnonymous(70,60,90)
    println(boolTemp2)
  }
}
