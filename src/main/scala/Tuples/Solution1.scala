package Tuples

object Solution1 {
  def main(args: Array[String]): Unit = {
    val tuple1 = (65, "Sunny", "Stars")
    val (temp1,sky1,view1) = tuple1
    println(temp1)
    println(sky1)
    println(view1)
    val tuple2 =
      (78, "Cloudy", "Satellites")
    val (temp2,sky2,view2) = tuple2
    println(temp2)
    println(sky2)
    println(view2)
    val tuple3 = (51, "Blue", "Night")
    val (temp3,sky3,view3) = tuple3
    println(temp3)
    println(sky3)
    println(view3)
  }
}
