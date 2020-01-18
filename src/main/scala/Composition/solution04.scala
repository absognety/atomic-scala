package Composition

import Composition.solution02.{Mobility,Vision,Manipulator}
object solution04 {
  class Robot(abilityVector:Vector[Any]) {
    override def toString: String = abilityVector.mkString(",")
  }

  def main(args: Array[String]): Unit = {
    val bot = new Robot(
      Vector(Mobility("Propeller"),
        Mobility("Legs"),
        Vision("UV"),
        Vision("Visible Spectrum"),
        Manipulator("Magnet"),
        Manipulator("Claw"))
    )
    println(bot)
  }
}
