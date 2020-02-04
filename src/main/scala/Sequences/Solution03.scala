package Sequences

import Sequences.Solution01._
object Solution03 {
  val people = Vector(Person("Zach","Smith","zach@smith.com"),
    Person("Mary","Add","mary@add.com"),
    Person("Sally", "Taylor", "sally@taylor.com"))

  def main(args: Array[String]): Unit = {
    val sorted = people.sortBy(r => r.lastName)
    println (sorted)
  }
}
