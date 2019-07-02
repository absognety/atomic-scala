package CaseClasses

object Solution2 {
  def main(args: Array[String]): Unit = {
    case class Person(fname:String,
                      lname:String,
                      contact_info:String) {
      var first = fname
      var last = lname
      var email = contact_info
    }
    val people = Vector(
      Person("Jane","Smile","jane@smile.com"),
      Person("Ron","House","ron@house.com"),
      Person("Sally","Dove","sally@dove.com"))
    println(people(0))
    println(people(1))
    println(people(2))
  }
}
