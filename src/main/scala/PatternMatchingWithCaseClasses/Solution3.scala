package PatternMatchingWithCaseClasses

object Solution3 {
  def main(args: Array[String]): Unit = {
    case class Passenger(first:String, last:String)
    case class Train(travelers:Vector[Passenger],
                     line:String)
    case class Bus(passengers:Vector[Passenger],
                   capacity:Int)
    case class Plane(passengers:Vector[Passenger],
                     planeName:String)
    case class Kitten(name:String)
    def travel(transport:Any):String = {
      transport match {
        case Train(travelers, line) =>
          s"Train line $line $travelers"
        case Bus(travelers, seats) =>
          s"Bus size $seats $travelers"
        case Plane(travelers,planeName) =>
          s"Plane $planeName + $travelers"
        case Passenger(first,last) => s"$first is walking"
        case what => s"$what is in limbo!"
      }
    }
    val travelers = Vector(
      Passenger("Harvey", "Rabbit"),
      Passenger("Dorothy", "Gale"))
    val trip2 = Vector(
      Train(travelers, "Reading"),
      Plane(travelers, "B757"),
      Bus(travelers, 100),
      Passenger("Sally","Marie"),Kitten("Kitty"))
    println(travel(trip2(3)))
    println(travel(trip2(4)))
  }
}
//don't have to make any changes to travel method - takes the default response.