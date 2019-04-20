package NamedandDefaultArguments

/**
  * Created by cvikas10 on 4/20/2019.
  */
object problem02 {
  def main(args: Array[String]): Unit = {
    class simpleTime(hours:Int,minutes:Int=0) {
      val Hours = hours
      val Minutes = minutes
    }
    val t2 = new simpleTime(hours = 10)
    println(t2.Hours)
    println(t2.Minutes)
  }
}
