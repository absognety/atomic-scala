package Vectors

/**
  * Created by cvikas10 on 4/6/2019.
  */
object problem04 {
  def main(args: Array[String]): Unit = {
    var myString = ""
    val words = Vector("The","dog","visited","the","firehouse")
    for (w <- words) {
      myString += w + " "
    }
    println(myString)
    myString = myString.replace("firehouse ","firehouse!")
    println(myString)
  }
}
