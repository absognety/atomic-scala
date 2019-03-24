package Expressions

/**
  * Created by cvikas10 on 3/19/2019.
  */
object problem04 {
  def main(args: Array[String]): Unit = {
    val theResult = {
      val feetPerMile = 5280
      val yardsPerMile = feetPerMile/3.0
      val numOfMiles = 2000/yardsPerMile
      numOfMiles
    }
    println(theResult)
  }
}
