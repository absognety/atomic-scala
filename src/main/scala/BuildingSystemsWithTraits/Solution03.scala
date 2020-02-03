package BuildingSystemsWithTraits

import BuildingSystemsWithTraits.Solution02._
import BuildingSystemsWithTraits.Solution01.{decaf, shots, syrup, toGo}
object Solution03 {
  trait Choc extends syrup
  class Mocha(shots2:shots,deCaf:decaf,ToGo:toGo,skim:syrup)
    extends Latte(shots2,deCaf,ToGo,skim) with Choc {
    class choc extends Choc {
      override def toString: String = "Choc"
    }
    val Choc = new choc
    override def toString: String = s"Mocha($shots2,$deCaf,$ToGo,$skim,$Choc)"
  }

  def main(args: Array[String]): Unit = {
    class Double extends shots {
      override def toString: String = "Double"
    }
    class Caf extends decaf {
      override def toString: String = "Caf"
    }
    class ToGo extends toGo {
      override def toString: String = "ToGo"
    }
    class Skim extends syrup {
      override def toString: String = "Skim"
    }
    val Double = new Double
    val Caf = new Caf
    val ToGo = new ToGo
    val Skim = new Skim
    val mocha = new Mocha(Double,Caf,ToGo,Skim)
    println(mocha)
  }
}
