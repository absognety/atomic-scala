package CombiningSequencesWithZip

object Solution04 {
  def number(s:String) =
    Range(0, s.length).zip(s)

  def number2(s:String) = {
    s.zipWithIndex.map{case (n,id) => (id,n)}
  }

  def main(args: Array[String]): Unit = {
    println (number("Howdy"))
    println (number2("Howdy"))
  }
}
