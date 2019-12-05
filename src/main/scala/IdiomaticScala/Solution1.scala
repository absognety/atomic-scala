package IdiomaticScala

object Solution1 {
  def main(args: Array[String]): Unit = {
    val z = false
    //If4.scala
    if(z) println("It's true!") else println("It's false")
    //If5.scala
    println(if(99 > 100) 4 else 42)
  }
}
