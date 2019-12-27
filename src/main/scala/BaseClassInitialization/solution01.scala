package BaseClassInitialization

object solution01 {
  def main(args: Array[String]): Unit = {
    class GreatApe(val weight:Double, val age:Int,val height:Int)
    class Bonobo(weight:Double, age:Int,height:Int)
      extends GreatApe(weight, age,height)
    class Chimpanzee(weight:Double, age:Int,height:Int)
      extends GreatApe(weight, age,height)
    class BonoboB(weight:Double, age:Int,height:Int)
      extends Bonobo(weight, age, height)
    class BonoboC(weight:Double,age:Int,height:Int)
      extends BonoboB(weight,age,height)
    def display(ape:GreatApe) = s"weight: ${ape.weight} age: ${ape.age}"
    println (display(new GreatApe(100, 12,6)))
    println (display(new Bonobo(100, 12,6)))
    println (display(new Chimpanzee(100, 12,6)))
    println (display(new BonoboB(100, 12,6)))
    println (display(new BonoboC(100, 12,6)))
  }
}
