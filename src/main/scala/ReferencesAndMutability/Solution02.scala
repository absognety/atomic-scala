package ReferencesAndMutability
import scala.collection.mutable.{Set => mutableSet}

object Solution02 {
  /*
  Mutable: Mutable means whose state can be changed after it is created.
  Immutable: Immutable means whose state cannot be changed once it is created.
   */
  var set1 = Set(1,2,4)
  val set2 = mutableSet(1,2,4)

  def main(args: Array[String]): Unit = {
    set1 += 10
    println (set1)
    set2 += 40
    println (set2)
  }
}
/*
https://stackoverflow.com/questions/35977507/confusion-about-mutable-and-immutable-set-in-scala
 */
