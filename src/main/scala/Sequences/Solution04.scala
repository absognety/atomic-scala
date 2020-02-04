package Sequences

object Solution04 {
  trait Contact {
    val emailaddress:String
  }
  abstract class friend(firstName:String,lastName:String) extends Contact
  class Friend(val firstName:String,val lastName:String,override val emailaddress:String = "") extends friend(firstName,lastName) {
    override def toString: String = Vector(firstName,lastName,emailaddress).toString
  }
  def main(args: Array[String]): Unit = {
    val friends = Vector(
      new Friend(
        "Zach", "Smith", "zach@smith.com"),
      new Friend(
        "Mary", "Add", "mary@add.com"),
      new Friend(
        "Sally","Taylor","sally@taylor.com"))
    val sorted = friends.sortBy(e => e.emailaddress)
    sorted.foreach(println)
  }
}
