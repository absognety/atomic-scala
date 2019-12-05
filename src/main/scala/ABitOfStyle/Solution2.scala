package ABitOfStyle

object Solution2 {
  def main(args: Array[String]): Unit = {
    class Exclaim(var s:String) {
      def parens()= s + "!"
      val noParens = s + "!"
    }
    val exclaim = new Exclaim("yes")
    println(exclaim.parens())
    println(exclaim.noParens)
  }
}
