package Summary_II

/**
  * Created by cvikas10 on 4/7/2019.
  */
object problem02 {
  def main(args: Array[String]): Unit = {
    var myString=""
    val strVector = Vector("Hi","how","are","you")
    val charVector = Vector("a","e","i","o","u")
    val intVector = Vector(1,2,3,4,5,6,7,8,9,10)
    val vector = Vector(strVector,charVector,intVector)
    for (m <- vector) {
      for (n <- m) {
        myString += n + " "
      }
    }
    println(myString)
  }
}
