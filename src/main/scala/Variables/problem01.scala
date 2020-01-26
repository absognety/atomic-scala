package Variables

/**
  * Created by cvikas10 on 3/6/2019.
  */
object problem01 {
  def main(args: Array[String]): Unit = {
    var myInt:Int = 5
    //reassigning myInt to val 10 will get an exception
    /* This problem can be solved by using var instead
    of val
     */
    myInt = 10
    println(myInt)
  }
}
