package Enumerations

object Level extends Enumeration {
  type Level = Value
  val Overflow, High, Medium,
  Low, Dry, Draining, Pooling, Empty = Value
}
object Solution6 {
  import Level._
  println (Medium)
  println(Level.Medium)
  def main(args: Array[String]): Unit = {
    val list1 = {for ( n <- Range(0,Level.maxId)) yield (n,Level(n))}
    val list2 = {for (lev <- Level.values) yield lev}.toIndexedSeq
    def checkLevel(level:Level) = level match {
      case Overflow => ">>> Overflow!"
      case Empty => "Alert"
      case Dry => "Alert"
      case Pooling => "Warning!"
      case other => s"Level $level OK"
    }
    println(Level.Draining)
    println(Level.Draining.id)
    println(checkLevel(Low))
    println(checkLevel(Empty))
    println(checkLevel(Draining))
    println(checkLevel(Pooling))
    println(checkLevel(Dry))
  }
}
