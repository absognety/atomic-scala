package Vectors

/**
  * Created by cvikas10 on 4/6/2019.
  */
object problem06 {
  def main(args: Array[String]): Unit = {
    val words = Vector("The","dog","visited","the","firehouse")
    println(words.reverse)
    for (w <- words.reverse) {
      println(w)
    }
  }
}
