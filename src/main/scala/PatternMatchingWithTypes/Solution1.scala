package PatternMatchingWithTypes

object Solution1 {
  def main(args: Array[String]): Unit = {
    def plus1(x:Any): String={
      x match {
        case s:String => x + "s"
        case n:Int => (n+1).toString
        case p:Person => s"$p + guest"
      }
    }
    case class Person(name:String)
    val joanna = Person("Joanna")
    println(plus1("car"))
    println(plus1(67))
    println(plus1(joanna))
  }
}
