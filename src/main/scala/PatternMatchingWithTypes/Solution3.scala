package PatternMatchingWithTypes

import scala.math.round
object Solution3 {
  def main(args: Array[String]): Unit = {
    def convertToSize(x:Any): Int={
      x match {
        case n:Int => n
        case s:String => s.length
        case p:Person => 1
        case q:Double => round(q).toInt
        case _ => 0
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
