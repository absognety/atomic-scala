package Evaluation_Order

/**
  * Created by cvikas10 on 3/24/2019.
  */
object problem03 {
  def main(args: Array[String]): Unit = {
    val sky:String = "sunny"
    val temp:Double = 10 //temp = 10
    if (((sky=="sunny") || (sky=="Partly Cloudy")) && ((temp > 80) || (temp < 20))) {
      println(true)
    } else {
      println(false)
    }
  }
}
