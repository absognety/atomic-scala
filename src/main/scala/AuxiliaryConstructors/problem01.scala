package AuxiliaryConstructors

object problem01 {
  def main(args: Array[String]): Unit = {
    class ClothesWasher(val model:String,
                        val capacity:Double) {
      println("Inside Primary Constructor")
      def this(model:String) {
        this(model, 89.89)
      }
      def this(capacity:Double) {
        this("G345SH91",capacity)
      }
      def show(): String={
        model + " " + capacity + " is" + " impressive"
      }
    }
    var clothesWasher = new ClothesWasher("H289SH12",78.92)
    println(clothesWasher.show())
    var clothesWasher2 = new ClothesWasher("J129SH80")
    println(clothesWasher2.show())
    var clothesWasher3 = new ClothesWasher(30.89)
    println(clothesWasher3.show())
  }
}
