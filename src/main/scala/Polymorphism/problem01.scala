package Polymorphism

object problem01 {
  trait Mobile {def means = "moving through"}
  class animals(s:String) extends Mobile {
    def isMove = {
      s"${means} $s"
    }
  }
  class vehicles(val s:String) extends animals(s) with Mobile

  def main(args: Array[String]): Unit = {
    val Animal = new animals("legs")
    println(Animal.isMove)
    val vehicle = new vehicles("wheels")
    println(vehicle.isMove)
  }
}
