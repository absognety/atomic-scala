package Summary1

/**
  * Created by cvikas10 on 3/31/2019.
  */
object problem0910 {
  def main(args: Array[String]): Unit = {
    val lbs = 150.0
    val height = 68.0
    val weightStatus = {
      val bmi = lbs/(height * height) * 703.07
      val idealWeight = bmi * (height * height)/703.07
      if (bmi < 18.5) {println("UnderWeight")}
      else if (bmi < 25) {println("Normal Weight")}
      else {println("OverWeight")}
      println(idealWeight)
    }
  }
}
