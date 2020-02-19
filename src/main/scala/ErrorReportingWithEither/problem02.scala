package ErrorReportingWithEither

class Cell {
  var entry = ' '
  def set(e:Char): Either[String,String]={
    if (entry==' ' && (e=='X' || e=='O')) {
      entry = e
      Right("successful move")
    } else {Left("Invalid move")}
  }
}
class Grid {
  val cells = Vector(
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell)
  )
  def play(e:Char, x:Int, y:Int): String = {
    val decision = if(x < 0 || x > 2 || y < 0 || y > 2) {
      Left("Invalid move")
    } else {cells(x)(y).set(e)}
    decision match {
      case Right(why) => why
      case Left(what) => what
    }
  }
}
object problem02 {
  def main(args: Array[String]): Unit = {
    val grid = new Grid
    println (grid.play('X',1,1))
    println (grid.play('X',1,1))
    println (grid.play('O',1,3))
  }
}
/*
OUTPUT should be:

successful move
Invalid move
Invalid move
 */