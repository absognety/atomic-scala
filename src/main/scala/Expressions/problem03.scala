package Expressions

/**
  * Created by cvikas10 on 3/19/2019.
  */
object problem03 {
  def main(args: Array[String]): Unit = {
    val numOfMiles = {
      val feetPerMile = 5280
      val yardsPerMile = feetPerMile/3.0
      2000/yardsPerMile
    }
    println(numOfMiles)
  }
}
