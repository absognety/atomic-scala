package Testing
//import com.atomicscala.AtomicTest._
/**
  * Created by cvikas10 on 4/6/2019.
  */
object problem02 {
  def main(args: Array[String]): Unit = {
    val myValue3 = 10
    val myValue4 = 10
    assert(myValue3!=myValue4,"values didn't match")
  }
}
