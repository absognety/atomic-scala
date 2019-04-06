package Vectors

/**
  * Created by cvikas10 on 4/6/2019.
  */
object problem03 {
  def main(args: Array[String]): Unit = {
    var myString = ""
    val words = Vector("The","dog","visited","the","firehouse")
    for (w <- words) {
      myString += w + " "
    }
    println(myString)
    assert(myString == "The dog visited the firehouse ")
  }
}
