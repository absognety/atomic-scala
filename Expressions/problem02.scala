package Expressions

/**
  * Created by cvikas10 on 3/19/2019.
  */
object problem02 {
  def main(args: Array[String]): Unit = {
    val yardsPerMile = {
      val feetPerMile = 5280
      feetPerMile/3.0
    }
    println(yardsPerMile)
  }
}
