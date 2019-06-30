package ClassExercises

object Solution1 {
  def main(args: Array[String]): Unit = {
    class Dimension(height:Int,
                    width:Int) {
      var h = height
      var w = width
    }
    val test = new Dimension(5,7)
    println(test.h)
    println(test.w)
    test.h = 10
    println(test.h)
    test.w = 19
    println(test.w)
  }
}
