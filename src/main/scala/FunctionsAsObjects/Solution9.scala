package FunctionsAsObjects

object Solution9 {
  def main(args: Array[String]): Unit = {
    var v = Vector("word", "cat", "animal")
    val pluralize = (str:String) => str + "s"
    val plural_v = v.map(x => pluralize(x))
    println(plural_v)
  }
}
