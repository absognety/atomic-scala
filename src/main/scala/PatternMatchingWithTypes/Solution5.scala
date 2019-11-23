package PatternMatchingWithTypes

object Solution5 {
  def main(args: Array[String]): Unit = {
    def forecast(temperature:Int): String={
      if (temperature==0) {
        "Cloudy"
      } else if (temperature > 0 && temperature <= 20) {
        "Mostly Cloudy"
      } else if (temperature > 20 && temperature <= 50) {
        "Partly Sunny"
      } else if (temperature > 50 && temperature <= 80) {
        "Mostly Sunny"
      } else if (temperature > 80 && temperature <= 100) {
        "Sunny"
      } else {
        "Unknown"
      }
    }
    println(forecast(100))
    println(forecast(81))
    println(forecast(80))
    println(forecast(51))
    println(forecast(50))
    println(forecast(21))
    println(forecast(20))
    println(forecast(1))
    println(forecast(0))
    println(forecast(-1))
  }
}
