package ClassExercises

object Solution2 {
  def main(args: Array[String]): Unit = {
    class Info(name:String,description:String) {
      val myname = name
      var mydescription = description
    }
    val info = new Info("stuff","Something")
    println(info.myname)
    println(info.mydescription)
    info.mydescription = "Something else"
    println(info.mydescription)
  }
}
