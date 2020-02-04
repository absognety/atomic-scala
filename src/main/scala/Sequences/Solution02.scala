package Sequences

import Sequences.Solution01._
object Solution02 {
  val person1 = Person("jennifer","aniston","jennifer.aniston@gmail.com")
  val person2 = Person("Angelina","Jolie","angelina.jolie@gmail.com")
  val person3 = Person("Brad","Pitt","brad.pitt@gmail.com")
  val people = Vector(person1,person2,person3)

  def main(args: Array[String]): Unit = {
    println (people.size)
    println (people.length)//same as size
  }
}
