package NamedandDefaultArguments

/**
  * Created by cvikas10 on 4/20/2019.
  */
object problem01 {
  def main(args: Array[String]): Unit = {
    class simpleTime(hours:Int,minutes:Int) {
      val Hours = hours
      val Minutes = minutes
    }
    val t = new simpleTime(hours=5, minutes=30)
    println(t.Hours)
    println(t.Minutes)
  }
}
