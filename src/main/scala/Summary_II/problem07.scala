package Summary_II

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
        if (x<0 || x>2 || y<0 || y>2)
          "Invalid Move"
        else
          cells(x)(y).set(e)
      }
      def displayBoard(): Unit={
        for (m <- cells) {
          for (n <- m)
            println(n)
        }
      }
    }
    val grid = new Grid
    println(grid.play('X',1,1))
    println(grid.play('X',1,1))
    println(grid.play('O',1,3))
    grid.displayBoard()
  }
}
