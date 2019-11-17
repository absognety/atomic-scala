package ParametrizedTypes

import scala.collection.MapView

object Solution4 {
  def main(args: Array[String]): Unit = {
    val weatherMap = Map(100 -> "Sunny",80 -> "Mostly Sunny",
                          50 -> "Partly Sunny",
                          20 -> "Mostly Cloudy",
                           0 -> "Cloudy")
    var myWeather = Seq(100,80,20,100,20)
    println(myWeather)
    def historicalData(weather:Seq[Int]):Map[Int,Int]={
      weather.groupBy(x=>x).map(t => (t._1, t._2.size))
    }
    val weatherFreqs = historicalData(myWeather)
    for ((k,v) <- weatherFreqs) {
      println(s"${weatherMap(k)} -> $v")
    }
  }
}