package CaseClasses

object Solution3 {
  def main(args: Array[String]): Unit = {
    case class dog(name:String,
                   breed:String)
    val dogs = Vector(dog("Fido","Golden Lab"),
      dog("Ruff","Alaskan Malamute"),
      dog("Fifi","Miniature Poodle"))
    println(dogs(0))
    println(dogs(1))
    println(dogs(2))
  }
}
