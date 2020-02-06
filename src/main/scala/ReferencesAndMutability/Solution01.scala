package ReferencesAndMutability
import scala.collection.mutable.{Map => mutableMap}

object Solution01 {
  var demo1 = Map("a" -> 1,"b" -> 2,"c" -> 3)
  val demo2 = mutableMap(("e",5),("f",6))
  var demo3 = mutableMap(("e",30),("f",40))
  def main(args: Array[String]): Unit = {
    //demo1("a") = 23 => error
    //demo1 += Map("d" -> 4) => Not allowed in case of immutable map
    val ref2demo1 = demo1
    println (ref2demo1)
    demo2("e") = 8
    demo2("f") = 10
    println(demo2)
    demo3 = demo3 ++ mutableMap(("g",20))
    val ref2demo3 = demo3
    println (ref2demo3)
  }
}
