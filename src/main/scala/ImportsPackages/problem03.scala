package ImportsPackages
import ImportsPackages.pythogorean.RightTriangle
/**
  * Created by cvikas10 on 4/2/2019.
  */
object problem03 {
  def main(args: Array[String]): Unit = {
    val x = new RightTriangle
    println(x.hypotenuse(3,4))
    println(x.area(3,4))
    assert(x.hypotenuse(3,4) == 5)
    assert(x.area(3,4) == 6)
  }
}
