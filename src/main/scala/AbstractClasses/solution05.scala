package AbstractClasses

object solution05 {
  abstract class Animal {
    def templateMethod =
      s"The ${animalName} goes ${sound}"
    // Abstract methods (no method body):
    def animalName:String
    def animal(b:Int):String
    def sound:String
  }
  class Dog extends Animal {
    def animalName="Dog"
    override def animal(x:Int) = {s"dog has $x puppies"}
    def sound = "Bow!"
  }

  def main(args: Array[String]): Unit = {
    println((new Dog).animal(5))
    println((new Dog).animal(2))
    println((new Dog).sound)
    println((new Dog).templateMethod)
  }
}
