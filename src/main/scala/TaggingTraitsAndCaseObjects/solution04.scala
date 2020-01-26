package TaggingTraitsAndCaseObjects

object solution04 {
  import TaggingTraitsAndCaseObjects.parent._
  import TaggingTraitsAndCaseObjects._
  Color.values = Vector(Red, Green, Blue, Red,Purple, Purple)
  def display(c:Color) = c match {
    case Red => s"It's $c"
    case Green => s"It's $c"
    case Blue => s"It's $c"
    case _ => s"It's $c"
  }
  def main(args: Array[String]): Unit = {
    println (Color.values.map(display))
  }
}
/*
map function is not ignoring the duplicate Color and going ahead
 */
