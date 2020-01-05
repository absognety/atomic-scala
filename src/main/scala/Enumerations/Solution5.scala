package Enumerations

class Cell {
  var entry = ' '
  def set(e:Char):String = {
    if(entry==' ' && (e=='X' || e=='O')) {
      entry = e
      "successful move"
    } else
      "invalid move"
  }
}
object cells extends Enumeration {
  type cells = Vector[Cell]
  val first_cell_group = Vector(new Cell,new Cell,new Cell)
  val second_cell_group = Vector(new Cell,new Cell,new Cell)
  val third_cell_group = Vector(new Cell,new Cell,new Cell)
}

class Grid {
  import cells._
  def play(e:Char, x:Int, y:Int): Any= {
    if(x < 0 || x > 2 || y < 0 || y > 2)
      "invalid move"
    else
      if (x == 0) {first_cell_group(y).set(e)}
      else if (x == 1) {second_cell_group(y).set(e)}
      else {third_cell_group(y).set(e)}
  }
}
object Solution5 {
  def main(args: Array[String]): Unit = {
    val grid = new Grid
    println (grid.play('X',1,1))
    println (grid.play('X',1,1))
    println(grid.play('O',1,3))
  }
}
