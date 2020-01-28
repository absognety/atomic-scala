package BuildingSystemsWithTraits

object Solution01 {
  trait shots
  trait decaf
  trait milk
  trait toGo
  trait syrup
  case class Coffee(Shots:shots,
                    deCaf:decaf,
                    Milk:milk,
                    ToGo:toGo,
                    Syrup:syrup) {
    val numofshots = Shots.toString
    val typeOfdecaf = deCaf.toString
    val isMilk = Milk.toString
    val isToGo = ToGo.toString
    val isSyrup = Syrup.toString
    override def toString: String = s"Coffee($numofshots,$typeOfdecaf,$isMilk,$isToGo,$isSyrup)"
  }
  def main(args: Array[String]): Unit = {
    class Single extends shots {
      override def toString: String = "Single"}
    class Caf extends decaf {
      override def toString: String = "Caf"
    }
    class HalfCaf extends decaf {
      override def toString: String = "HalfCaf"
    }
    class Here extends milk {
      override def toString: String = "Here"
    }
    class Skim extends toGo {
      override def toString: String = "Skim"
    }
    class ToGo extends milk {
      override def toString: String = "ToGo"
    }
    class Choc extends syrup {
      override def toString: String = "Choc"
    }
    class Double extends shots {
      override def toString: String = "Double"
    }
    class NoMilk extends toGo {
      override def toString: String = "NoMilk"
    }
    class NoFlavor extends syrup {
      override def toString: String = "NoFlavor"
    }
    println (Coffee(new Single,new Caf,new Here,new Skim,new Choc))
    println (Coffee(new Double,new Caf,new Here,new NoMilk,new NoFlavor))
    println (Coffee(new Double,new HalfCaf,new ToGo,new Skim,new Choc))
  }
}
