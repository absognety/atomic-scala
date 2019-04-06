package Vectors

/**
  * Created by cvikas10 on 4/6/2019.
  */
object problem09 {
  def main(args: Array[String]): Unit = {
    val xy = Range(1,10).inclusive
    println(xy.sum)
  }
}
//Yes, calling method sum on Range iterable will do it one step.