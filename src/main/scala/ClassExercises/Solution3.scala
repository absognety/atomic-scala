package ClassExercises

object Solution3 {
  def main(args: Array[String]): Unit = {
    class Info(name:String,description:String) {
      var myname = name
      var mydescription = description
    }
    val info = new Info("stuff","Something")
    println(info.myname)
    println(info.mydescription)
    info.mydescription = "Something else"
    info.myname = "This is the new name"
    println(info.mydescription)
    println(info.myname)
  }
}
