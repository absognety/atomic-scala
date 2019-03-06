package Variables_Exercises

/**
  * Created by cvikas10 on 3/6/2019.
  */
object problem03 {
  def main(args: Array[String]): Unit = {
    var v1:Int = 5
    v1 = 10
    val constantv1 = v1
    v1=15
    println(v1)
    println(constantv1)
  }
}
//No the value of constantv1 did not change
