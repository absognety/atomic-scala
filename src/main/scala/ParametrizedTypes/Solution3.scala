package ParametrizedTypes

object Solution3 {
  def main(args: Array[String]): Unit = {
    def returnSet(vector: Vector[Double]):Set[Double]={
      vector.toSet
    }
    val v = returnSet(Vector(1.2,3.90,9.11))
    println(v)
  }
}
