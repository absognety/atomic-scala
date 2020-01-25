package TaggingTraitsAndCaseObjects

object EnumColor2 extends Enumeration {
  type EnumColor2 = Value
  val Red = Value("Red")
  val Blue = Value("Blue")
  val Green = Value("Green")
  val Red2 = Value("Red")
}
object solution03 {
  def main(args: Array[String]): Unit = {
    println (EnumColor2.Red)
    println (EnumColor2.Blue)
    println (EnumColor2.Green)
    println (EnumColor2.Red2)
  }
}
/*
As long as the enumeration name is different, can add duplicate colors
when tried to add duplicate to existing enumeration "EnumColor", leads to
java.lang.NoSuchMethod Error.
 */
