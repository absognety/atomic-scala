package StringInterpolation

object Solution2 {
  def main(args: Array[String]): Unit = {
    class Gardengnome (val height:Double,
                       val weight:Double, val happy:Boolean) {
      println("Inside Primary Constructor")
      var painted = true
      def magic(level:Int): Unit={
        println (s"Poof! $level $happy $painted")
      }
      def this(height:Double) {
        this(height, 100.0, true)
      }
      def this(name:String) {
        this(15.0)
        painted = true
      }
      def show(level1:Int): Unit= {
        magic(level1)
      }
    }
    val gnome =
      new Gardengnome(20.0, 50.0, false)
    gnome.show(87)
    val bob = new Gardengnome("Bob")
    bob.show(25)
  }
}
