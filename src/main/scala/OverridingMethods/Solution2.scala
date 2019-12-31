package OverridingMethods

object Solution2 {
  def main(args: Array[String]): Unit = {
    class GreatApe2(val weight:Int,val height:Int,
                   val gender:String) {
      var myWords = Vector("Roar")
      def bmi(weight:Int,height:Int): Long= {weight/(height*height)}
    }
    class Bonobo2(weight:Int,height:Int,gender:String)
      extends GreatApe2(weight,height,gender) {
      myWords = Vector("Roar","Hello")
    }
    val roaringApe = new GreatApe2(112,9,"Male")
    println (roaringApe.myWords)
    val chattyBonobo = new Bonobo2(150, 14, "Female")
    println (chattyBonobo.myWords)
  }
}
