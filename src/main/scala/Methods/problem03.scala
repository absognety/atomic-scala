package Methods

/**
  * Created by cvikas10 on 3/31/2019.
  */
object problem03 {
  def main(args: Array[String]): Unit = {
    def isArg1GreaterThanArg2(x:Double,y:Double): Boolean = {
      x > y
    }
    println(isArg1GreaterThanArg2(3.9,2.31))
    assert(true==isArg1GreaterThanArg2(3.9,2.31))
    println(isArg1GreaterThanArg2(56,31))
    assert(true==isArg1GreaterThanArg2(3.9,2.31))
    println(isArg1GreaterThanArg2(12,89))
    assert(false==isArg1GreaterThanArg2(12,89))
  }
}
