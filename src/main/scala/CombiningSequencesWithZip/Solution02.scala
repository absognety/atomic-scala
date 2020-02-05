package CombiningSequencesWithZip

import CombiningSequencesWithZip.zipUse._
object Solution02 {
  val people1 = Vector("Sally Smith",
    "Dan Jones", "Tom Brown", "Betsy Blanc",
    "Stormy Morgan")
  val group11 = Vector("Sally Smith","Dan Jones","Tom Brown")
  val group21 = Vector("Betsy Blanc","Stormy Morgan")

  def main(args: Array[String]): Unit = {
    val pairs1 = group11.zip(group21)
    println (pairs1)
  }
}
/*
the odd one from initial list is not considered in zipped vector
 */
