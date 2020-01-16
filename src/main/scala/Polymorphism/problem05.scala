package Polymorphism

object problem05 {
  abstract class Seed {
    def toString: String
  }
  class Tomato extends Seed {
    override def toString: String = "this is a tomato plant!!"
  }
  class Corn extends Seed {
    override def toString: String = "this is a corn field!"
  }
  class Zucchini extends Seed {
    override def toString: String = "Wow! Zucchini plant"
  }
  class Garden(seeds:Any) {
    val seedVector = Vector(seeds)
    override def toString: String = seedVector.mkString(",")
  }

  def main(args: Array[String]): Unit = {
    val garden = new Garden(new Tomato,new Corn,new Zucchini)
    println (garden.toString)
  }
}
