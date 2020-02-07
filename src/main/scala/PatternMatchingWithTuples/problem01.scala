package PatternMatchingWithTuples

import PatternMatchingWithTuples.Color
import PatternMatchingWithTuples.Color._

package object colorblend {
  def blend(a:Color, b:Color) =
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
      case _ => // Interesting, not accurate:
        Color((a.id + b.id) % Color.maxId)
    }
}

object problem01 {
  import colorblend._

  def main(args: Array[String]): Unit = {
    println (blend(red,yellow))
    println (blend(yellow,red))
    println (blend(red,red))
    println (blend(purple,orange))
  }
}
/*
Error:(13, 23) illegal variable in pattern alternative
           (`yellow`, red) => orange
 */