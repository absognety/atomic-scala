package PatternMatching
import PatternMatching.forecastTemperature.forecast
/**
  * Created by cvikas10 on 4/20/2019.
  */
object problem05 {
  def main(args: Array[String]): Unit = {
    val sunnyData = Vector(100,80,50,20,0,15)
    for (temp <- sunnyData) {
      println(forecast(temp))
    }
  }
}
