package StringInterpolation

object Solution1 {
  def main(args: Array[String]): Unit = {
    class Gardengnome (val height:Double,
                       val weight:Double, val happy:Boolean) {
      println("Inside Primary Constructor")
      var painted = true
      def magic(level:Int): String={
        "Poof! " + level
      }
      def this(height:Double) {
        this(height, 100.0, true)
      }
      def this(name:String) {
        this(15.0)
        painted = true
      }
      def show():String = {
        s"$height $weight $happy $painted"
      }
    }
    val gnome =
      new Gardengnome(20.0, 110.0, false)
    println(gnome.show())
    val bob = new Gardengnome("Bob")
    println(bob.show())
  }
}
