package CombiningSequencesWithZip

object Solution03 {
  val people2 = List("Sally Smith",
    "Dan Jones", "Tom Brown", "Betsy Blanc",
    "Stormy Morgan", "Hal Goodsen")
  val group12 = List("Sally Smith","Dan Jones","Tom Brown")
  val group22 = List("Betsy Blanc","Stormy Morgan","Hal Goodsen")
  val pairs2 = group12.zip(group22)

  def main(args: Array[String]): Unit = {
    println (pairs2)
  }
}
//No don't have to make any other modifications