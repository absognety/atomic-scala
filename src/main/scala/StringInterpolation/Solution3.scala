package StringInterpolation

object Solution3 {
  def main(args: Array[String]): Unit = {
    class GardenGnome (val height:Double,
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
        if (height!=15.0 && weight!=100.0) {
          s"height: $height + weight: $weight happy: $happy painted: $painted"
        }
        else {s"height: $height weight: $weight $happy $painted"}
      }
    }
    val gnome =
      new GardenGnome(20.0, 110.0, false)
    println(gnome.show())
    val bob = new GardenGnome("Bob")
    println(bob.show())
  }
}
