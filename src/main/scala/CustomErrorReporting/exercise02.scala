package CustomErrorReporting
import scala.util.{Success,Failure,Try}

class failException(msg:String) extends Exception(msg)
class Cell {
  var entry = ' '
  def set(e:Char): Try[String] = {
    if(entry==' ' && (e=='X' || e=='O')) {
      entry = e
      Success("Successful Move")
    }
    else {Failure(new failException("invalid1"))}
  }
}

class Grid {
  val cells = Vector(
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell)
  )
  def play(e:Char, x:Int, y:Int): Try[String] = {
    if(x < 0 || x > 2 || y < 0 || y > 2)
      Failure(new failException("invalid2"))
    else
      cells(x)(y).set(e)
  }
  def runPlay(e:Char,x:Int,y:Int): String = {
    play(e,x,y) match {
      case Failure(f:failException) => "invalid move"
      case Success(msg:String) => msg
    }
  }
}
object exercise02 {
  def main(args: Array[String]): Unit = {
    val grid = new Grid
    println (grid.runPlay('X',1,1))
    println (grid.runPlay('X',1,1))
    println (grid.runPlay('O',1,3))
  }
}
