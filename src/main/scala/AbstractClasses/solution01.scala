package AbstractClasses

object solution01 {
  abstract class Animal {
    def templateMethod =
      s"The $animal goes $sound"
    // Abstract methods (no method body):
    def animal:String
    def sound:String
    def food:String
  }
  class Duck extends Animal {
    def animal = "Duck"
    // "override" is optional here:
    override def sound = "Quack"
    def food = "plants"
  }
  class Cow extends Animal {
    def animal = "Cow"
    def sound = "Moo"
    def food = "grass"
  }

  def main(args: Array[String]): Unit = {
    println((new Duck).food)
    println((new Cow).food)
    println((new Duck).templateMethod)
    println((new Cow).templateMethod)
  }
}
