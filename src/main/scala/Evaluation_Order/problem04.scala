package Evaluation_Order

/**
  * Created by cvikas10 on 3/24/2019.
  */
object problem04 {
  def main(args: Array[String]): Unit = {
    val F:Double = 96.4
    val term:Double = F - 32
    val C:Double = (100.toDouble/180.toDouble) * (term)
    println(C)
  }
}