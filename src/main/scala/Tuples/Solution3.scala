package Tuples

object Solution3 {
  def main(args: Array[String]): Unit = {
    def weather(temperature:Double,
                humidity:Double)={
      var temp_status = ""
      var humid_status = ""
      if (temperature > 80) { temp_status = "Hot"}
      else if (temperature < 50) { temp_status = "Cold"}
      else { temp_status = "Temperate"}
      if ((humidity > 40) && (temperature < 50)) {
        humid_status = "Damp"
      }else if (humidity > 40) { humid_status = "Humid"}
      else { humid_status = "Pleasant"}
      (temp_status,humid_status)
    }
    println(weather(81,45))
    println(weather(50,45))
  }
}
