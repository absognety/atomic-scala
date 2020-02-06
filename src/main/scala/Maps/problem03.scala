package Maps

import Maps.problem02._
object problem03 {
  var m2 = createMap("sally@taylor.com")
  val m3 = m2 ++ createMap("jiminy@cricket.com")

  def main(args: Array[String]): Unit = {
    println (m2)
    println (m3)
    println (m3("sally@taylor.com"))
    println (m3("jiminy@cricket.com"))
  }
}
