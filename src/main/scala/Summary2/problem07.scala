package Summary2

/**
  * Created by cvikas10 on 4/7/2019.
  */
object problem07 {
  def main(args: Array[String]): Unit = {
    class Cell{
      var entry = ' '
      def set(e:Char): String={
        if (entry==' ' && (e=='X' || e=='O')) {
          entry=e
          "Successful Move"
        } else {"Invalid Move"}
      }
    }
    class Grid {
      val cells = Vector(
        Vector(new Cell,new Cell,new Cell),
        Vector(new Cell,new Cell,new Cell),
        Vector(new Cell,new Cell,new Cell)
      )
      def play(e:Char,x:Int,y:Int): String={
        val status = {
          if (x<0 || x>2 || y<0 || y>2)
            "Invalid Move"
          else
            cells(x)(y).set(e)
        }
        displayBoard()
        status
      }
      def displayBoard(): Unit={
        for (m <- cells) {
          for (n <- m)
            print(n.entry + " ")
        }
      }
    }
    val grid = new Grid
    println(grid.play('X',1,1))
    println(grid.play('X',1,1))
    println(grid.play('O',1,3))
    grid.play('O', 0, 0)
    grid.play('X', 2, 2)
    grid.displayBoard()
  }
}
/* OUTPUT_SHOULD_BE
  X
successful move
  X
invalid move
  X
invalid move
O
  X
successful move
O
  X
    X
successful move
*/