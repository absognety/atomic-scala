package Tuples

object Solution4 {
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
    val (heat1,moisture1) = weather(81,45)
    println(s"heat1 $heat1")
    println(s"moisture1 $moisture1")
    val (heat2,moisture2) = weather(27,55)
    println(s"heat2 $heat2")
    println(s"moisture2 $moisture2")
  }
}
