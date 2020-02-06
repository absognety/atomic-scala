package Maps

import Maps.problem04._
import Maps.problem03._
object problem06 {
  val new_languages = languages.filter(_._2 != "Spanish")
  val new_m3 = m3.-("jiminy@cricket.com")

  def main(args: Array[String]): Unit = {
    println (new_languages)
    println (new_m3)
  }
}
