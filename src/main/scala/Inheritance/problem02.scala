package Inheritance

object problem02 {
  def main(args: Array[String]): Unit = {
    class GreatApe {
      def vocalize = {"Grrr!"}
    }
    def says(ape: GreatApe)={s"says ${ape.vocalize}"}
    class Bonobo extends GreatApe
    class Chimpanzee extends Bonobo
    class BonoboB extends Chimpanzee
    println(says(new GreatApe))
    println(says(new Bonobo))
    println(says(new Chimpanzee))
    println(says(new BonoboB))
  }
}
