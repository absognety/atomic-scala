package Maps

object problem04 {
  val languages = Map(1 -> "English",2 -> "French",
    3 -> "Spanish",4 -> "German",5 -> "Chinese")

  def main(args: Array[String]): Unit = {
    val languages2 = languages ++ Map(6 -> "Turkish")
    println(languages2)
  }
}
/*
OUTPUT is
HashMap(5 -> Chinese, 1 -> English, 6 -> Turkish, 2 -> French, 3 -> Spanish, 4 -> German)
 */
