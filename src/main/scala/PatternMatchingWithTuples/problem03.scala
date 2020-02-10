package PatternMatchingWithTuples

import colorblend._
import PatternMatchingWithTuples.Color._
object problem03 {
  class doubleHyperWrapper extends wrapper {
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
        case (`brown`, _) |
             (_, `brown`) => brown
        case _ => // Interesting, not accurate:
          Color((a.id + b.id) % Color.maxId)
      }
  }

  def main(args: Array[String]): Unit = {
    val dhyperw = new doubleHyperWrapper
    println (dhyperw.blend(red,yellow))
    println (dhyperw.blend(red,red))
    println (dhyperw.blend(yellow,blue))
    println (dhyperw.blend(yellow,magenta))
    println (dhyperw.blend(red,magenta))
  }
}
