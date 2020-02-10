package PatternMatchingWithTuples

import PatternMatchingWithTuples.Color._
import colorblend._
object problem04 {
  class tripleHyperWrapper extends wrapper {
    override def blend(a:Color, b:Color) =
      (a, b) match {
        case _ if a == b => a
        case (`red`, `blue`) |
             (`blue`, `red`) => purple
        case (`red`, `yellow`) |
             (`yellow`, `red`) => orange
        case (`blue`, `yellow`) |
             (`yellow`, `blue`) => green
        case (`yellow`,`magenta`) |
             (`magenta`,`yellow`) => purple
        case (`red`,`magenta`) |
             (`magenta`,`red`) => purple
        case (x,y) if x == white => y
        case (x,y) if y == white => x
        case (`brown`, _) |
             (_, `brown`) => brown
        case _ => // Interesting, not accurate:
          Color((a.id + b.id) % Color.maxId)
      }
  }

  def main(args: Array[String]): Unit = {
    val thyperw = new tripleHyperWrapper
    println (thyperw.blend(red,yellow))
    println (thyperw.blend(red,red))
    println (thyperw.blend(yellow,blue))
    println (thyperw.blend(yellow,magenta))
    println (thyperw.blend(red,magenta))
    println (thyperw.blend(purple,white))
    println (thyperw.blend(white,red))
  }
}
