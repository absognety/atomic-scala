package CaseClasses

object Solution1 {
  def main(args: Array[String]): Unit = {
    case class Person(fname:String,
                      lname:String,
                      contact_info:String) {
      var first = fname
      var last = lname
      var email = contact_info
    }
    val p = Person("Jane","Smile","jane@smile.com")
    println(p.first)
    println(p.last)
    println(p.email)
  }
}
