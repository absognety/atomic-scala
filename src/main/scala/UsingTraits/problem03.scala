package UsingTraits

import UsingTraits.problem02.{Connections,Object}
object problem03 {
  class WIFICamera extends Object with Connections

  def main(args: Array[String]): Unit = {
    val c2 = new WIFICamera with Connections
    println (c2.maxConnections)
    println (c2.connect(true))
    println (c2.connected)
    println (c2.connect(false))
    println (c2.connected)
    println (c2.connect(false))
  }
}
