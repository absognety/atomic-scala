package Variables_Exercises

/**
  * Created by cvikas10 on 3/6/2019.
  */
object problem04 {
  def main(args: Array[String]): Unit = {
    var v1 = 0
    var v2:Int = v1
    println(v2)
    v1 = 20
    v2 = v1
    println(v2)
  }
}
//Yes, the value of v2 changed.

