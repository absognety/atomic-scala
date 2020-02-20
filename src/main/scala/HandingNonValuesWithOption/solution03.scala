package HandingNonValuesWithOption

class Cellnew {
  var entry = ' '
  def set(e:Char): Option[String]={
    if (entry==' ' && (e=='X' || e=='O')) {
      entry = e
      Some("successful move")
    } else None
  }
}
class Gridnew {
  val cells = Vector(
    Vector(new Cellnew, new Cellnew, new Cellnew),
    Vector(new Cellnew, new Cellnew, new Cellnew),
    Vector(new Cellnew, new Cellnew, new Cellnew)
  )
  def play(e:Char, x:Int, y:Int): String = {
    val decision = if(x < 0 || x > 2 || y < 0 || y > 2) {
      None
    } else {cells(x)(y).set(e)}
    decision match {
      case Some(x) => x
      case None => "Invalid move"
    }
  }
}
object solution03 {
  def main(args: Array[String]): Unit = {
    val grid = new Gridnew
    println (grid.play('X',1,1))
    println (grid.play('X',1,1))
    println (grid.play('O',1,3))
  }
}
