package Evaluation_Order

/**
  * Created by cvikas10 on 3/24/2019.
  */
object problem05 {
  def main(args: Array[String]): Unit = {
    val C:Double = 35.7777786
    val term:Double = (180.toDouble/100.toDouble) * C
    val F:Double = term + 32
    println(F)
  }
}
