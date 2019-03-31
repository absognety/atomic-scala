package Methods

/**
  * Created by cvikas10 on 3/31/2019.
  */
object problem02 {
  def main(args: Array[String]): Unit = {
    def getSquareDouble(x:Double): Double={
      println("square of the double....")
      x*x
    }
    val sd1 = getSquareDouble(1.2)
    assert(1.44==sd1,"Validated here")
    val sd2 = getSquareDouble(5.7)
    assert(32.49==sd2,"Validated here")
    println(sd1)
    println(sd2)
  }
}
