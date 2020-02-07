package ReferencesAndMutability

import scala.math.pow
object Solution04 {
  val testv = Vector(1,2,3,4,5,6)

  def main(args: Array[String]): Unit = {
    println (testv.length)
    val newtestv = testv.map(x => pow(x,2).round)
    println ("new testv ",newtestv)
    println ("Old testv",testv)
    /*newtestv(3) = 45, this operation not permitted
    by using functions like map,collect,flatten the elements of
    a vector can be updated
     */
  }
}
