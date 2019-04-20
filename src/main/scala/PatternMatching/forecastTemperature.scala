package PatternMatching

/**
  * Created by cvikas10 on 4/20/2019.
  */
object forecastTemperature {
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
}
