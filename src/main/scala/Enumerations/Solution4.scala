package Enumerations

import Solution1._
object Solution4 {
  def main(args: Array[String]): Unit = {
    def season(month:String)={
      if (List("December","January","February").contains(month)) {"Winter"}
      else if (List("March","April","May").contains(month)) {"Spring"}
      else if (List("June","July","August").contains(month)) {"Summer"}
      else {"Autumn"}
    }
    println(season(february.toString))
    println(season(may.toString))
    println(season(june.toString))
    println(season(september.toString))
  }
}
