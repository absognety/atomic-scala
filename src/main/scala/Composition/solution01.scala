package Composition

object solution01 {
  trait Mobility {
    def mobility(mob:String):String = s"$mob"
  }
  trait Vision {
    def vision(vis:String):String = s"$vis"
  }
  trait Manipulator {
    def manipulator(man:String):String = s"$man"
  }
  class Robot(mob:String,vis:String,man:String) extends Mobility with Vision with Manipulator {
    var typeVector = Vector[String]()
    typeVector = typeVector :+ mobility(mob) :+ vision(vis) :+ manipulator(man)
    override def toString: String = typeVector.mkString(",")
  }

  def main(args: Array[String]): Unit = {
    val walker = new Robot("Legs",
      "Visible Spectrum", "Magnet")
    println(walker)
    val crawler = new Robot("Treads",
      "Infrared", "Claw")
    println(crawler)
    val arial = new Robot("Propeller",
      "UV", "None")
    println(arial)
  }
}
