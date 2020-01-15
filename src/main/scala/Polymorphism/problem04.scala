package Polymorphism

import Polymorphism.problem02.Element
object problem04 {
  class Character(val player:String="None")
    extends Element
  class Dragon(override val player:String) extends Character(player:String)

  def main(args: Array[String]): Unit = {
    val d = new Dragon("Puff")
    println(d.player)
    val t = new Dragon("Duff")
    println(t.player)
  }
}
