package Maps

import Maps.problem04._
object problem05 {
  def main(args: Array[String]): Unit = {
    val languages3 = languages ++ Map(6 -> "French")
    println (languages3)
    val languages4 = languages ++ Map(4 -> "French")
    println (languages4)
  }
}
/*
OUTPUT is
HashMap(5 -> Chinese, 1 -> English, 6 -> French, 2 -> French, 3 -> Spanish, 4 -> German)
HashMap(5 -> Chinese, 1 -> English, 2 -> French, 3 -> Spanish, 4 -> French)
 */