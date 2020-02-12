package Sequences

import Sequences.Solution04.companion
object Solution06 {
  def main(args: Array[String]): Unit = {
    val friends3 = Vector(
      new companion(
        "Zach", "Smith", "zach@smith.com"),
      new companion(
        "Mary", "Add", "mary@add.com"),
      new companion(
        "Sally","Taylor","sally@taylor.com"),
      new companion(
        "Mary", "Smith", "mary@smith.com") )
    val s1 = friends3.sortBy(r => r.lastName)
    val s2 = s1.sortBy(s => s.firstName)
    s2.foreach(println)
  }
}
