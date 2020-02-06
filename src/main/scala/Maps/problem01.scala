package Maps

object example {
  val constants = Map("Pi" -> 3.141,
    "e" -> 2.718, "phi" -> 1.618)
  val constants2 = Map(("Pi", 3.141), ("e", 2.718), ("phi", 1.618))
  val constants3 = Vector(("Pi", 3.141), ("e", 2.718),
    ("phi", 1.618)).toMap
  val ex1 = constants("e")
  val keys = constants.keys
  val values = constants.values
  val mylist1 = (for(pairs <- constants) yield pairs.toString)
  val mylist2 = (for((k,v) <- constants) yield k + ": " + v)
}
object problem01 {
  import example._
  val new_constants = constants.map{case (id -> value) => (value -> id)}

  def main(args: Array[String]): Unit = {
    println (new_constants.getClass)
    println (new_constants)
  }
}
