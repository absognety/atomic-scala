package AuxiliaryConstructors

object problem04 {
  def main(args: Array[String]): Unit = {
    class ClothesWasher(val x:Double,
                        val y:Int) {
      println(x)
      println("\n")
      println(y)
      def test(x:Double): Unit={
        println("This is the test 1")
      }
      def test(): Unit={
        println("This is the test 2")
      }
      def test(y:Int): Unit= {
        println("This is the test 3")
        println(y)
      }
      def wash(z:Int,w:Int): String={
        "Wash used " + z.toString + " bleach and " + w.toString + " fabric softener"
      }
      def wash(): Unit= {
        println("Simple wash")
      }
    }
    val myWasher = new ClothesWasher(x=67.23,y=90)
    myWasher.test()
    myWasher.test(x=67.23)
    myWasher.test(y=89)
    println(myWasher.wash(2,1))
    myWasher.wash()
  }
}
