package PatternMatchingWithTypes

object Solution2 {
  def main(args: Array[String]): Unit = {
    def convertToSize(x:Any): String={
      x match {
        case n:Int => n.toString
        case s:String => s.length.toString
        case p:Person => 1.toString
        case q:Double => q.toString
        case _ => 0.toString
      }
    }
    case class Person(name:String)
    val joanna = Person("Joanna")
    println(convertToSize(45))
    println(convertToSize("car"))
    println(convertToSize("truck"))
    println(convertToSize(Person("Joanna")))
    println(convertToSize(45.6))
    println(convertToSize(Vector(1, 2, 3)))
  }
}
