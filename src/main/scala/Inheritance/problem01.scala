package Inheritance

object problem01 {
  def main(args: Array[String]): Unit = {
    class GreatApe {
      def vocalize = {"Grrr!"}
    }
    class Bonobo extends GreatApe
    class Chimpanzee extends Bonobo
    val ape1 = new GreatApe
    println(ape1.vocalize)
    val ape2 = new Bonobo
    println(ape2.vocalize)
    val ape3 = new Chimpanzee
    println(ape3.vocalize)
  }
}
