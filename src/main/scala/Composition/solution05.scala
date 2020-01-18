package Composition

import Composition.solution02.{Mobility,Vision,Manipulator}
object solution05 {
  class Robot {
    var resultVector = Vector[Any]()
    var mobilityVector = Vector[Mobility]()
    var visionVector = Vector[Vision]()
    var manipulatorVector = Vector[Manipulator]()
    def addMobility(mob:Mobility): Unit = {
      mobilityVector = mobilityVector :+ mob
    }
    def addVision(vis:Vision): Unit = {
      visionVector = visionVector :+ vis
    }
    def addManipulator(man:Manipulator): Unit = {
      manipulatorVector = manipulatorVector :+ man
    }
    override def toString: String = {
      resultVector = resultVector :+ mobilityVector.mkString(",") :+ visionVector.mkString(",") :+ manipulatorVector.mkString(",")
      resultVector.mkString("|")
    }
  }

  def main(args: Array[String]): Unit = {
    val bot = new Robot
    bot.addMobility(
      Mobility("Propeller"))
    bot.addMobility(
      Mobility("Legs"))
    bot.addVision(
      Vision("UV"))
    bot.addVision(Vision(
      "Visible Spectrum"))
    bot.addManipulator(
      Manipulator("Magnet"))
    bot.addManipulator(
      Manipulator("Claw"))
    println(bot)
  }
}
