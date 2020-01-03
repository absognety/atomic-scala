package Enumerations

object Solution1 extends Enumeration {
  type Solution1 = Value
  val january = Value("January")
  val february = Value("February")
  val march = Value("March")
  val april = Value("April")
  val may = Value("May")
  val june = Value("June")
  val july = Value("July")
  val august = Value("August")
  val september = Value("September")
  val october = Value("October")
  val november = Value("November")
  val december = Value("December")

  def main(args: Array[String]): Unit = {
    println(Solution1.february)
    println(Solution1.february.id)
    println(Solution1.july.id)
    println(Solution1.january.id)
  }
}
