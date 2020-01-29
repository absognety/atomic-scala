package BuildingSystemsWithTraits

import Solution01.{shots,decaf,toGo,syrup,milk,Coffee}
object Solution02 {
  class test extends syrup
  val Test = new test
  var convString = ""
  class Coffee1(Shots:shots,
                    deCaf:decaf,
                    ToGo:toGo,
                val Syrup:syrup = Test) {
    val numofshots = Shots.toString
    val typeOfdecaf = deCaf.toString
    val isToGo = ToGo.toString
    val isSyrup = Syrup.toString
    if (Syrup == Test) {
      convString = s"Coffee($numofshots,$typeOfdecaf,$isToGo)"
    } else {convString = s"Coffee($numofshots,$typeOfdecaf,$isToGo,$isSyrup)"}
    override def toString: String = convString
  }
  class Latte(shots1:shots,decaf1:decaf,togo:toGo,syrup1:syrup) extends Coffee1(shots1,decaf1,togo,syrup1) with milk

  def main(args: Array[String]): Unit = {
    class Single extends shots {
      override def toString: String = "Single"}
    class Double extends shots {
      override def toString: String = "Double"
    }
    class Caf extends decaf {
      override def toString: String = "Caf"
    }
    class Here extends toGo {
      override def toString: String = "Here"
    }
    class Skim extends syrup {
      override def toString: String = "Skim"
    }
    val Single = new Single
    val Double = new Double
    val Caf = new Caf
    val Here = new Here
    val Skim = new Skim
    val latte = new Latte(Single, Caf,
      Here, Skim)
    println (latte)
    val usual = new Coffee1(Double, Caf, Here)
    println (usual)
  }
}
