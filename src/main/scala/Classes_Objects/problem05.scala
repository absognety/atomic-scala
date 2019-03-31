package Classes_Objects

/**
  * Created by cvikas10 on 3/31/2019.
  */
object problem05 {
  def main(args: Array[String]): Unit = {
    var s1 = "sally"
    var s3 = s1.toUpperCase()
    println(s3)
    println(s1)
    println(s1.contentEquals(s3))
    if (s3.contentEquals(s1)) {println("s1 and s3 are equal")}
    else {println("s1 and s3 are not equal")}
  }
}
