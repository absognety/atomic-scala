package PatternMatching

/**
  * Created by cvikas10 on 4/20/2019.
  */
object problem04 {
  def main(args: Array[String]): Unit = {
    def forecast(cloudiness:Int): String={
      cloudiness match {
        case 100 => "Sunny"
        case 80 => "Mostly Sunny"
        case 50 => "Partly Sunny"
        case 20 => "Mostly Cloudy"
        case 0 => "Cloudy"
        case _ => "UNKNOWN"
      }
    }
    println(forecast(100))
    println(forecast(80))
    println(forecast(50))
    println(forecast(20))
    println(forecast(0))
    println(forecast(-45))
  }
}
