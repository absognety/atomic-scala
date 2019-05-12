package Constructors

/**
  * Created by cvikas10 on 5/12/2019.
  */
object problem01 {
  def main(args: Array[String]): Unit = {
    class Coffee(shots:Int,
                 decaf:Int,
                 val milk:Boolean = false,
                 val caf:Int = 1,
                 val toGo:Boolean = false,
                 val syrup:String="") {
      var result = ""
      var SHOTS=shots
      var DECAF = decaf
      println(SHOTS,DECAF,milk,toGo,syrup)
      def getCup(): Unit={
        if (toGo) {
          result += "ToGoCup"
        } else {
          result += "HereCup"
        }
      }
    }
    val doubleHalfCaf = new Coffee(shots=2, decaf=1)
    println(doubleHalfCaf.SHOTS)
    println(doubleHalfCaf.DECAF)
    println(doubleHalfCaf.caf)
    val tripleHalfCaf = new Coffee(shots=3, decaf=2)
    println(tripleHalfCaf.DECAF)
    println(tripleHalfCaf.SHOTS)
    println(tripleHalfCaf.caf)
  }
}
