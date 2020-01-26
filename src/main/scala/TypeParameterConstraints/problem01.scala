package TypeParameterConstraints

trait Building
trait Room
trait Storage
trait Sink
trait Store {
  def fixBound[T >: Food <: Utensil]
}
trait Cook {
  def fixBound[T >: Food <: Utensil]
}
trait Clean {
  def fixBound[T >: Food <: Utensil]
}

trait Food extends Store with Clean with Cook
trait Utensil extends Store with Clean with Cook

object Food extends Enumeration {
  type Food = Value
  val food1 = Value("Red meat")
  val food2 = Value("prawns")
}

object Utensil extends Enumeration {
  type Utensil = Value
  val utensil1 = Value("oven")
  val utensil2 = Value("pan")
}

trait Kitchen extends Room {
  val storage:Storage
  val sinks:Vector[Sink]
  val food:Food
  val utensils:Vector[Utensil]
}

trait House extends Building {
  val kitchens:Vector[Kitchen]
}
object problem01 {
  def main(args: Array[String]): Unit = {
    println(Utensil.utensil1)
    println(Food.food1)
  }
}
