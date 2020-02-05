package CombiningSequencesWithZip

object zipUse {
  val people = Vector("Sally Smith",
    "Dan Jones", "Tom Brown", "Betsy Blanc",
    "Stormy Morgan", "Hal Goodsen")
  val group1 = Vector("Sally Smith","Dan Jones","Tom Brown")
  val group2 = Vector("Betsy Blanc","Stormy Morgan","Hal Goodsen")
  val pairs = group1.zip(group2)
}
object Solution01 {
  import zipUse._
  def main(args: Array[String]): Unit = {
    println (pairs)
  }
}
