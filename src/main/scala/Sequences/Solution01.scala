package Sequences

object Solution01 {
  case class Person(firstName:String,
                    lastName:String,
                    email:String) {
    val info = Vector(firstName,lastName,email)
    val fullName = info.take(2).mkString(" ")
    val first = info.head
    val eMail = info.last
  }

  def main(args: Array[String]): Unit = {
    val p = Person("John", "Smith",
      "john@smith.com")
    println (p.fullName)
    println (p.first)
    println (p.email)
  }
}
