package Testing

/**
  * Created by cvikas10 on 4/4/2019.
  */
object problem01 {
  def main(args: Array[String]): Unit = {
    val myValue1 = 20
    val myValue2 = 10
    println(myValue1.isInstanceOf[Int])
    println(myValue2.isInstanceOf[Int])
    //myValue1 is myValue2 raises an exception
  }
}
