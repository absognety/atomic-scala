package DesignByContract

object problem03 {
  def meth(t:Int) = {
    //require(t%2 == 0,"given number is not even")
    if (t%2 != 0) {"precondition failure"}
    else {
      val u = 3*t
      if (u%2 == 0) {"Success"}
      else {"postcondition failure"}
    }
    //assume((3*t)%2 == 0,"the result is odd, so this is a failure")
  }
  def main(args: Array[String]): Unit = {
    println (meth(23))
    println (meth(12))
    println (meth(13))
  }
}
/*
Eliding is demoed in another version of this solution
 */
