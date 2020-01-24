package Composition

import Composition.solution02.{Mobility,Vision,Manipulator}
object solution06 {
  class Robot {
    var finalVector = Vector[Any]()
    var mobilityVector = Vector[Mobility]()
    var visionVector = Vector[Vision]()
    var manipulatorVector = Vector[Manipulator]()
    def +(that:Mobility): Any= {
      mobilityVector = mobilityVector :+ that
    }
    def +(that:Vision): Any= {
      visionVector = visionVector :+ that
    }
    def +(that:Manipulator): Any= {
      manipulatorVector = manipulatorVector :+ that
    }
    override def toString: String = {
      finalVector = finalVector :+ mobilityVector.mkString(",") :+ visionVector.mkString(",") :+ manipulatorVector.mkString(",")
      finalVector.mkString("|")
    }
  }

  def main(args: Array[String]): Unit = {
    val bot = new Robot
    bot.+(Mobility("Propeller"))
    bot.+(Mobility("Legs"))
    bot.+(Vision("UV"))
    bot.+(Vision("Visible Spectrum"))
    bot.+(Manipulator("Magnet"))
    bot.+(Manipulator("Claw"))
    println (bot)
  }
}
