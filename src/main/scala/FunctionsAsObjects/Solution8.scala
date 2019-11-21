package FunctionsAsObjects

object Solution8 {
  def main(args: Array[String]): Unit = {
    val pluralize = (str:String) => str + "s"
    println (pluralize("cat"))
    println (pluralize("dog"))
    println (pluralize("silly"))
  }
}
