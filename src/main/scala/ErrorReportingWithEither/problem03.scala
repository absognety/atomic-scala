package ErrorReportingWithEither

object problem03 {
  val letters = ('a' to 'z') map {
    case x => if (Seq('a','e','i','o','u').contains(x)) {Left(x)}
    else {Right(x)}
  }
  def main(args: Array[String]): Unit = {
    println (letters)
  }
}
