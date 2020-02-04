package Sequences

import Sequences.Solution04.Friend
object Solution05 {
  def main(args: Array[String]): Unit = {
    val friends2 = Vector(
      new Friend(
        "Zach", "Smith", "zach@smith.com"),
      new Friend(
        "Mary", "Add", "mary@add.com"),
      new Friend(
        "Sally","Taylor","sally@taylor.com"),
      new Friend(
        "Mary", "Smith", "mary@smith.com"))
    val s1 = friends2.sortBy(r => r.firstName)
    val s2 = s1.sortBy(s => s.lastName)
    println (s2)
  }
}
