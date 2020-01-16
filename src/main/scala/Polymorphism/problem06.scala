package Polymorphism

object problem06 {
  trait Shape
  class Ellipse extends Shape {
    override def toString : String = "Ellipse"
  }
  class Rectangle extends Shape {
    override def toString: String = "Rectangle"
  }
  class Circle extends Ellipse with Shape {
    override def toString: String = "Circle"
  }
  class Square extends Rectangle with Shape {
    override def toString: String = "Square"
  }

  class Drawing(figures:Shape*) {
    var figuresVector = Vector[Shape]()
    for (e <- figures) {figuresVector = figuresVector :+ e}
    def draw = figuresVector.map(_.toString)
    override def toString: String = figuresVector.mkString(",")
  }

  def main(args: Array[String]): Unit = {
    val drawing = new Drawing(
      new Rectangle, new Square,
      new Ellipse, new Circle)
    println (drawing.draw)
    println (drawing)
  }
}
