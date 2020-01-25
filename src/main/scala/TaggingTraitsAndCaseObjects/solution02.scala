package TaggingTraitsAndCaseObjects

object EnumColor extends Enumeration {
  type EnumColor = Value
  val Red = Value("Red")
  val Blue = Value("Blue")
  val Green = Value("Green")
}
object solution02 {
  def main(args: Array[String]): Unit = {
    println (EnumColor.Red)
    println (EnumColor.Blue)
    println (EnumColor.Green)
  }
}
