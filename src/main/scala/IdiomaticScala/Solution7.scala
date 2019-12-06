package IdiomaticScala

object Solution7 {
  def main(args: Array[String]): Unit = {
    //ClassArg.scala
    class ClassArg(a:Int) {def f() = a * 10}
    val ca = new ClassArg(19)
    println(ca.f())

    class Sum(args:Int*) {
      def result() = {
        var total = 0
        for(n <- args)
          total += n
        total
      }
    }
    println (new Sum(13, 27, 44).result())
    println (new Sum(1, 3, 5, 7, 9, 11).result())
  }
}
