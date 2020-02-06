package Maps

object problem07 {
  class Person(name:String)
  case class human(name:String)
  val person1 = new Person("Janice")
  val person2 = new Person("Elon musk")
  val m = Map(person1 -> "CFO",person2 -> "CEO",human("Janice") -> "CFO",
    human("Elon musk") -> "CEO")

  def main(args: Array[String]): Unit = {
    println (m(person1),m(person2))
    println (m(human("Janice")),m(human("Elon musk")))
  }
}
