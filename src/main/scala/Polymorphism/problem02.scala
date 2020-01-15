package Polymorphism

import ALittleReflection.Name.Name
object problem02 {
  class Element extends Name {
    def interact(other:Element) =
      s"$this interact $other"
    def draw = "Drawing the element"
  }
  class Inert extends Element {
    override def draw = "Inert drawing!"
  }
  class Wall extends Inert

  def main(args: Array[String]): Unit = {
    val e = new Element
    println (e.draw)
    val in = new Inert
    println (in.draw)
    val wall = new Wall
    println (wall.draw)
  }
}
