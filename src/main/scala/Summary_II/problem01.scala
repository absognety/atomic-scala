package Summary_II

/**
  * Created by cvikas10 on 4/7/2019.
  */
object problem01 {
  def main(args: Array[String]): Unit = {
    val strVector = Vector("Hi","how","are","you")
    val charVector = Vector("a","e","i","o","u")
    val intVector = Vector(1,2,3,4,5,6,7,8,9,10)
    println(strVector.max)
    println(charVector.max)
    println(intVector.max)

    println(strVector.min)
    println(charVector.min)
    println(intVector.min)
  }
}
