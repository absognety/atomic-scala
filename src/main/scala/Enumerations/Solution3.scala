package Enumerations

object monthInfo extends Enumeration {
  type monthInfo = Value
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
}

object Solution3 {
  import monthInfo._
  def main(args: Array[String]): Unit = {
    def monthNumber(month:String): Int = {
      month match {
        case "January" => 1
        case "February" => 2
        case "March" => 3
        case "April" => 4
        case "may" => 5
        case "June" => 6
        case "July" => 7
        case "August" => 8
        case "September" => 9
        case "October" => 10
        case "November" => 11
        case "December" => 12
      }
    }
    println(january.toString)
    println(february.toString)
    println(monthNumber(april.toString))
    println(monthNumber(november.toString))
  }
}