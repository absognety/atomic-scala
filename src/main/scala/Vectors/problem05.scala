package Vectors

/**
  * Created by cvikas10 on 4/6/2019.
  */
object problem05 {
  def main(args: Array[String]): Unit = {
    val words = Vector("The","dog","visited","the","firehouse")
    for (w <- words) {
      println(w.reverse)
    }
  }
}
