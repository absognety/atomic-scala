package Sequences

import Sequences.Solution04.companion
object Solution05 {
  def main(args: Array[String]): Unit = {
    val friends2 = Vector(
      new companion(
        "Zach", "Smith", "zach@smith.com"),
      new companion(
        "Mary", "Add", "mary@add.com"),
      new companion(
        "Sally","Taylor","sally@taylor.com"),
      new companion(
        "Mary", "Smith", "mary@smith.com"))
    val s1 = friends2.sortBy(r => r.firstName)
    val s2 = s1.sortBy(s => s.lastName)
    println (s2)
    s2.foreach(println)
  }
}
