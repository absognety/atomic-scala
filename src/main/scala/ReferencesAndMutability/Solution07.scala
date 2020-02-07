package ReferencesAndMutability

object Solution07 {
  class otherClass(var s1:Int,val s2:Int)

  def main(args: Array[String]): Unit = {
    val x1 = new otherClass(2,5)
    println(x1.getClass)
    x1.s1 = 34
    println (x1.s1,x1.s2)
  }
}
/*
The resulting class is immutable
 */
