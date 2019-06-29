package AuxiliaryConstructors

object problem02 {
  def main(args: Array[String]): Unit = {
    class ClothesWasher2(val model:String="G345SH91",
                         val capacity:Double) {
      def show(): Unit={
        println(model + " " + capacity + " is" + " impressive")
      }
    }
    class ClothesWasher3(val model:String,
                         val capacity:Double=56.90) {
      def show(): Unit={
        println(model + " " + capacity + " is" + " impressive")
      }
    }
    class ClothesWasher4(val model:String,
                         val capacity:Double) {
      def show(): Unit={
        println(model + " " + capacity + " is" + " impressive")
      }
    }
    val x = new ClothesWasher2(capacity = 78.90)
    x.show()
    val y = new ClothesWasher3(model = "F129SH21")
    y.show()
    val z = new ClothesWasher4("6772772",90.11)
    z.show()
  }
}
