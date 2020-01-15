package Polymorphism

import Polymorphism.problem02.{Element,Inert}
object problem03 {
  class Wall extends Inert {
    override def draw = "Don't draw on the wall"
  }
  def main(args: Array[String]): Unit = {
    val e = new Element
    println (e.draw)
    val in = new Inert
    println (in.draw)
    val wall = new Wall
    println (wall.draw)
  }
}
