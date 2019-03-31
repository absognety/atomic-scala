package Methods

/**
  * Created by cvikas10 on 3/31/2019.
  */
object problem07 {
  def main(args: Array[String]): Unit = {
    def bmiStatus(weight:Int,height:Int): String={
      val bmi = weight.toDouble/(height * height) * 703.07
      if (bmi < 18.5) {"Under Weight"}
      else if (bmi < 25) {"Normal Weight"}
      else {"Over Weight"}
    }
    val p1 = bmiStatus(160,68)
    val p2 = bmiStatus(180,60)
    val p3 = bmiStatus(100,68)
    println(p1)
    println(p2)
    println(p3)
  }
}
