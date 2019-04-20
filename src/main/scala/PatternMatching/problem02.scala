package PatternMatching

/**
  * Created by cvikas10 on 4/20/2019.
  */
object problem02 {
  def main(args: Array[String]): Unit = {
    val v = Vector(1)
    val v2 = Vector(3, 4)

    def oneOrTheOther(exp: Boolean): String = {
      exp match {
        case true => "True!"
        case _ => "It's false"
      }
    }
    println(oneOrTheOther(v == v.reverse))
    println(oneOrTheOther((v2==v2.reverse)))
  }
}
