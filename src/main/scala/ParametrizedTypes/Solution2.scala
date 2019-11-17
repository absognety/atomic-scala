package ParametrizedTypes

object Solution2 {
  def main(args: Array[String]): Unit = {
    def returnList(vector: Vector[Double]):List[Double]={
      vector.toList
    }
    val v = returnList(Vector(1.2,3.90,9.11))
    println(v)
  }
}
