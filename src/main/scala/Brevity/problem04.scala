package Brevity

object problem04 {
  def main(args: Array[String]): Unit = {
    class Coffee(val shots:Int = 2,
                 val decaf:Boolean = false,
                 val milk:Boolean = false,
                 val toGo:Boolean = false,
                 val syrup:String = "") {
      var result = ""
      println(shots, decaf, milk, toGo, syrup)
      def getCup() = {
        if(toGo) result += "ToGoCup " else result += "HereCup "
      }
      def pourShots() = {
        for(s <- 0 until shots)
          if(decaf) result += "decaf shot " else result += "shot "
      }
      def addMilk() = {
        if(milk) result += "milk "
      }
      def addSyrup() = {
        result += syrup
      }
      getCup()
      pourShots()
      addMilk()
      addSyrup()
    }
    val usual = new Coffee
    println(usual.result)
    val mocha = new Coffee(decaf = true,
      toGo = true, syrup = "Chocolate")
    println(mocha.result)
  }
}
