package OverridingMethods

object Solution1 {
  def main(args: Array[String]): Unit = {
    class GreatApe {
      def call = "Hoo!"
      var energy = 3
      def eat = { energy += 10; energy }
      def climb(x:Int) = energy -=x
    }
    class Bonobo extends GreatApe {
      override def call = "Eep!"
      // Modify the base-class var:
      energy = 5
      // Call the base-class version:
      override def eat() = super.eat * 2
      // Add a new method:
      def run() = "Bonobo runs"
    }
    class Chimpanzee extends GreatApe {
      override def call = "Yawp!"
      override def eat() = super.eat * 3
      def jump = "Chimp jumps"
      val kind = "Common" // New field
    }
    def talk(ape:GreatApe) = {
      // ape.run() // Not an ape method
      // ape.jump // Nor this
      ape.climb(4)
      ape.call + ape.eat
    }
    println (talk(new GreatApe))
    println (talk(new Bonobo))
    println (talk(new Chimpanzee))
  }
}
// parenthesis after eat is not necessary. it is kept to symbolize
//method.