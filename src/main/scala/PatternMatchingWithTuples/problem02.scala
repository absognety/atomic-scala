package PatternMatchingWithTuples

import PatternMatchingWithTuples.Color
import PatternMatchingWithTuples.Color._
import colorblend._
object problem02 {
  class hyperwrapper extends wrapper {
    override def blend(a:Color, b:Color) =
      (a, b) match {
        case _ if a == b => a
        case (`red`, `blue`) |
             (`blue`, `red`) => purple
        case (`red`, `yellow`) |
             (`yellow`, `red`) => orange
        case (`blue`, `yellow`) |
             (`yellow`, `blue`) => green
        case (`brown`, _) |
             (_, `brown`) => brown
      }
  }

  def main(args: Array[String]): Unit = {
    val hwrapper = new hyperwrapper
    println (hwrapper.blend(red,yellow))
    println (hwrapper.blend(red,red))
    println (hwrapper.blend(yellow,blue))
  }
}
