package ABitOfStyle

object Solution4 {
  def main(args: Array[String]): Unit = {
    class Exclaim4(var s:String) {
      var count = 0
      var string:String = s
      def exclamation(): Unit={
        count += 1
        string += "!"
      }
    }
    val e4 = new Exclaim4("counting")
    e4.exclamation()
    e4.exclamation()
    println(e4.count)
    println(e4.string)
  }
}
