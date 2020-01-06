package AbstractClasses

import AbstractClasses.solution01.{Cow, Duck}

object solution02 {
  abstract class Animal {
    def templateMethod =
      s"The $animal goes $sound"
    // Abstract methods (no method body):
    def animal:String
    def sound:String
    def food:String
  }
  class Chicken extends Animal {
    def animal = "Chicken"
    def sound = "Coco"
    def food = "insects"
  }
  class Pig extends Animal {
    def animal = "Pig"
    def sound = "anything"
    def food = "anything"
  }

  def main(args: Array[String]): Unit = {
    println((new Duck).food)
    println((new Cow).food)
    println((new Duck).templateMethod)
    println((new Cow).templateMethod)
    println((new Chicken).food)
    println((new Pig).food)
    println((new Chicken).templateMethod)
    println((new Pig).templateMethod)
  }
}
