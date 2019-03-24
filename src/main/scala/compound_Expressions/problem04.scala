package compound_Expressions

/**
  * Created by cvikas10 on 3/24/2019.
  */
object problem04 {
  def main(args: Array[String]): Unit = {
    val distance = 4
    //val activity = "swimming"
    val willDo = {
      if (distance <= 1){
        "swimming"
      }else if (distance <= 6 && distance > 1){
        "running"
      }else if (distance <=20 && distance > 6){
        "biking"
      }
    }
    println(willDo)
  }
}
