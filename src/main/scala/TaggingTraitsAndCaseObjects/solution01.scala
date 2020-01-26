package TaggingTraitsAndCaseObjects

object parent {
  sealed trait Color
  case object Red extends Color
  case object Green extends Color
  case object Blue extends Color
  case object Purple extends Color
}

object Color {
  import parent._
  var values = Vector(Red, Green, Blue, Purple)
}

object solution01 {
  import Color._
  import parent._
  def display(c:Color) = c match {
    case Red => s"It's $c"
    case Green => s"It's $c"
    case Blue => s"It's $c"
    case _ => s"It's $c"
  }
  def main(args: Array[String]): Unit = {
    println (values.map(display))
  }
}
/*
Exception => scala.MatchError
 */