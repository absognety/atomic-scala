package Methods

/**
  * Created by cvikas10 on 3/31/2019.
  */
object problem01 {
  def main(args: Array[String]): Unit = {
    def getSquare(x:Int,expected:Int): Unit={
      val Squared = x * x
      assert(Squared==expected,"Expected result is " +
        expected + " where as the actual result is " + Squared)
      println("result is " + Squared)
    }
    val a = getSquare(3,9)
    val b = getSquare(6,36)
    val c = getSquare(5,25)

    //val d = getSquare(3,2)
    //val e = getSquare(6,9)
    //val f = getSquare(5,25)
  }
}
