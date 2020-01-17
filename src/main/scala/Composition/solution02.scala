package Composition

object solution02 {
  case class Mobility(mob:String) {
    def mobility = s"$mob"
  }
  case class Vision(vis:String) {
    def vision = s"$vis"
  }
  case class Manipulator(man:String) {
    def manipulator = s"$man"
  }
  class Robot(mob:Mobility,vis:Vision,man:Manipulator) {
    var typeVector = Vector[Any]()
    typeVector = typeVector :+ mob :+ vis :+ man
    override def toString: String = typeVector.mkString(",")
  }

  def main(args: Array[String]): Unit = {
    val walker = new Robot(
      Mobility("Legs"),
      Vision("Visible Spectrum"),
      Manipulator("Magnet"))
    println (walker)
    val crawler = new Robot(
      Mobility("Treads"),
      Vision("Infrared"),
      Manipulator("Claw"))
    println (crawler)
    val arial = new Robot(
      Mobility("Propeller"),
      Vision("UV"),
      Manipulator("None"))
    println (arial)
  }
}
