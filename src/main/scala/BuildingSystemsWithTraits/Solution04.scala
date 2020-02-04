package BuildingSystemsWithTraits

import SodaFountain._
import IceCream._
object Solution04 {
  object Container extends Enumeration {
    type Container = Value
    val Pint,Quart,HalfGallon = Value
  }
  import Container._
  case class TakeHome(container: Container,flavor:IceCream)

  def main(args: Array[String]): Unit = {
    println (TakeHome(Pint, Chocolate))
    println (TakeHome(Quart, Strawberry))
    println (TakeHome(HalfGallon, Vanilla))
  }
}
