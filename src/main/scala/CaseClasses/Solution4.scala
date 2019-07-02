package CaseClasses

object Solution4 {
  def main(args: Array[String]): Unit = {
    case class Dimension1(height:Int,
                         width:Int) {
      var h = height
      var w = width
    }
    class Dimension2(height:Int,
                    width:Int) {
      var ht = height
      var wt = width
    }
    val dim1 = Dimension1(5,7)
    println(dim1.h)
    println(dim1.w)
    val dim2 = new Dimension2(5,6)
    println(dim2.ht)
    println(dim2.wt)
    dim1.h = 20
    dim1.w = 21
    println(dim1.h)
    println(dim1.w)
    dim2.ht = 34
    dim2.wt = 12
    println(dim2.ht)
    println(dim2.wt)
  }
}
/*
In case of case classes new keyword need not be used
while instantiating a class to create an object

In case of just a class, new keyword is essential.
 */