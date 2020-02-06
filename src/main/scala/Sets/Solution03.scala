package Sets

object Solution03 {
  val box1 = Set("shoes", "clothes")
  val box2 = Set("toys", "dishes")
  val box3 = Set("toys", "games", "books")
  val attic = Set(box1, box2)
  val basement = Set(box3)
  val house = Set(attic, basement)

  def main(args: Array[String]): Unit = {
    val ans1 = attic.flatten
    val ans2 = basement.flatten
    val result = Set(ans1,ans2)
    assert (result.flatten == Set("shoes", "clothes", "toys",
      "dishes", "games", "books"))
    println (result.flatten == Set("shoes", "clothes", "toys",
      "dishes", "games", "books"))
  }
}
