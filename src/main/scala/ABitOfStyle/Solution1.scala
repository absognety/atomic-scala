package ABitOfStyle

object Solution1 {
  def main(args: Array[String]): Unit = {
    class Exclaim(var s:String) {
      def parens()= s + "!"
      def noParens = s + "!"
    }
    val exclaim = new Exclaim("yes")
    println(exclaim.parens())
    println(exclaim.noParens)
  }
}
