package Summary_II

/**
  * Created by cvikas10 on 4/7/2019.
  */
object problem06 {
  def main(args: Array[String]): Unit = {
    class Temperature {
      var current = 0.0
      var scale = "f"
      def setFahrenheit(now:Double): Unit={
        current = now
        scale = "f"
      }
      def setCelsius(now:Double): Unit={
        current=now
        scale="c"
      }
      def getFahrenheit(): Double={
        if (scale=="f") {current}
        else {
          current * 9.0/5.0 + 32
        }
      }
      def getCelsius(): Double={
        if (scale=="c")
          current
        else {
          (current-32) * 5.0/9.0
        }
      }
      def setKelvin(now:Double): Unit={
        current=now
        scale = "k"
      }
      def getKelvin(): Double={
        if (scale=="k")
          current
        else if (scale=="c"){
          current + 273.0
        }
        else {5.0/9.0 * (current-32) + 273.0}
      }
    }
    val temp = new Temperature
    temp.setFahrenheit(98.6)
    println(temp.getFahrenheit())
    println(temp.scale)
    println(temp.getCelsius())
    temp.setCelsius(38.82)
    println(temp.getKelvin())
    println(temp.scale)
  }
}
