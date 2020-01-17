package Composition

import Composition.solution02.{Mobility,Vision,Manipulator}
object solution03 {
  class Robot(mobVector:Vector[Mobility],
              VisVector:Vector[Vision],
              manVector:Vector[Manipulator]) {
    var finalVector = Vector[Any]()
    finalVector = finalVector :+ mobVector.mkString(",") :+ VisVector.mkString(",") :+ manVector.mkString(",")
    override def toString: String = finalVector.mkString("|")
  }

  def main(args: Array[String]): Unit = {
    val bot = new Robot(
      Vector(
        Mobility("Propeller"),
        Mobility("Legs")),
      Vector(
        Vision("UV"),
        Vision("Visible Spectrum")),
      Vector(
        Manipulator("Magnet"),
        Manipulator("Claw"))
    )
    println (bot)
  }
}
