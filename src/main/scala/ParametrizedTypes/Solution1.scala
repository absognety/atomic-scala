package ParametrizedTypes

object Solution1 {
  def main(args: Array[String]): Unit = {
    // Return type is inferred:
    def inferred(c1:Char, c2:Char, c3:Char)={
      Vector(c1, c2, c3)
    }
    // Explicit return type:
    def explicit(c1:Char, c2:Char, c3:Char):Vector[Char] = {
      Vector(c1, c2, c3)
    }
    def explicitDouble(d1:Double,d2:Double,d3:Double):Vector[Double]={
      Vector(d1,d2,d3)
    }
    println(inferred('a','b','c'))
    println(explicit('a','b','c'))
    println(explicitDouble(34.89,233,2.0))
  }
}
