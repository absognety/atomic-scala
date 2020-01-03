package Enumerations

object Solution2 extends Enumeration {
  type Solution2 = Value
  val january = Value(1,"January")
  val february = Value(2,"February")
  val march = Value(3,"March")
  val april = Value(4,"April")
  val may = Value(5,"May")
  val june = Value(6,"June")
  val july = Value(7,"July")
  val august = Value(8,"August")
  val september = Value(9,"September")
  val october = Value(10,"October")
  val november = Value(11,"November")
  val december = Value(12,"December")

  def main(args: Array[String]): Unit = {
    println(Solution2.february)
    println(Solution2.february.id)
    println(Solution2.july.id)
    println(Solution2.january.id)
  }
}
/*explicitly setting the id after enumeration is declared is not possible. it will
throw reassignment to val exception.
 */
