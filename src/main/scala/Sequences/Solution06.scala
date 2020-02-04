package Sequences

import Sequences.Solution04.Friend
object Solution06 {
  def main(args: Array[String]): Unit = {
    val friends3 = Vector(
      new Friend(
        "Zach", "Smith", "zach@smith.com"),
      new Friend(
        "Mary", "Add", "mary@add.com"),
      new Friend(
        "Sally","Taylor","sally@taylor.com"),
      new Friend(
        "Mary", "Smith", "mary@smith.com") )
    val s1 = friends3.sortBy(r => r.lastName)
    val s2 = s1.sortBy(s => s.firstName)
    s2.foreach(println)
  }
}
