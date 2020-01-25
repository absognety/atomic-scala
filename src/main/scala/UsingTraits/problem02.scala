package UsingTraits

object problem02 {
  trait Connections {
    var connected:Int = 0
    val maxConnections = 5
  }
  class Object extends Connections {
    def connect(direction:Boolean) = {
      if (direction == true) {
        if (connected < maxConnections) {
          connected += 1
          true
        }else if (connected > maxConnections) {false}
        else {false}
      }else {
        if (connected > 0) {
          connected -= 1
          true
        } else {false}
      }
    }
  }
  def main(args: Array[String]): Unit = {
    val c = new Object with Connections
    println(c.maxConnections)
    println(c.connect(true))
    println(c.connected)
    for (i <- 0 to 3)
      println(c.connect(true))
    println(c.connect(true))
    println(c.connect(false))
    println(c.connected)
    for (i <- 0 to 3)
      println(c.connect(false))
    println(c.connected)
    println(c.connect(false))
  }
}
