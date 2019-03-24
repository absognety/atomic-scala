package Evaluation_Order

/**
  * Created by cvikas10 on 3/24/2019.
  */
object problem02 {
  def main(args: Array[String]): Unit = {
    val sky:String = "sunny"
    val temp:Double = 90
    if (((sky=="sunny") || (sky=="Partly Cloudy")) && (temp > 80)) {
      println(true)
    } else {
      println(false)
    }
  }
}
