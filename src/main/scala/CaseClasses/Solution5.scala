package CaseClasses

object Solution5 {
  def main(args: Array[String]): Unit = {
    case class Dimension1(height:Int,
                          width:Int) {
      var h = height
      val w = width
    }
    class Dimension2(height:Int,
                     width:Int) {
      var ht = height
      val wt = width
    }
    val V = Dimension1(9,10)
    val U = new Dimension2(11,12)
    println(V.h)
    V.h = 8
    //V.w = 10 : reassignment to val error - DON"T DO.
    println(V.h)
  }
}
