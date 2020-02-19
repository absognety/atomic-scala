package ErrorReportingWithEither

import ErrorReportingWithEither.problem03.letters
object problem04 {
  val testLetters = letters map {
    case Right(x) => s"Consonant: $x"
    case Left(x) => s"Vowel: $x"
  }

  def main(args: Array[String]): Unit = {
    println (testLetters)
    println(testLetters(0))
    println(testLetters(4))
    println (testLetters(13))
  }
}
