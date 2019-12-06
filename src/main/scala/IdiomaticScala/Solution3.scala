package IdiomaticScala

object Solution3 {
  def main(args: Array[String]): Unit = {
    val activity = "swimming"
    val hour = 10
    val isOpen = {
      if (activity == "swimming" ||
        activity == "ice skating") {
        val opens = 9
        val closes = 20
        println("Operating hours: " +
          opens + " - " + closes)
        if (hour >= opens && hour <= closes) true else false
      } else false
    }
    println(isOpen)
  }
}
//There is also option to remove isOpen and instead use definition directly.