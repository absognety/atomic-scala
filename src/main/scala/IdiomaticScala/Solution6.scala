package IdiomaticScala

object Solution6 {
  def main(args: Array[String]): Unit = {
    // Dog.scala
    class Dog { def bark() = "yip!"}
    // Cat.scala
    class Cat { def meow() = "mew!"}
    class Hamster {
      def speak() = "squeak!"
      def exercise() = speak() + " Running on wheel"
    }
    val cat = new Cat
    val m1 = cat.meow()
    assert("mew!" == m1,
      "Expected mew!, Got " + m1)
    val hamster = new Hamster
    val e1 = hamster.exercise()
    assert(
      "squeak! Running on wheel" == e1,
      "Expected squeak! Running on wheel" +
        ", Got " + e1)
  }
}
