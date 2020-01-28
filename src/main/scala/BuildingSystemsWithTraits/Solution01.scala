package BuildingSystemsWithTraits

object Solution01 {
  trait Coffee {
    var shots = 2
    var decaf = false
    var milk = false
    var toGo = false
    var syrup = ""
    var result = ""
    println(shots,decaf,milk,toGo,syrup)
    def getCup = {
      if(toGo)
        result += "ToGoCup "
      else
        result += "HereCup "
    }
    def pourShots = {
      for(s <- 0 until shots)
        if(decaf)
          result += "decaf shot "
        else
          result += "shot "
    }
    def addMilk = {
      if(milk)
        result += "milk "
    }
    def addSyrup = {
      result += syrup
    }
  }
  class Main extends Coffee
  def main(args: Array[String]): Unit = {
    val usual = new Main
    usual.getCup
    usual.pourShots
    usual.addMilk
    usual.addSyrup
    println(usual.result)
    val mocha = new Main
    mocha.decaf = true
    mocha.toGo = true
    mocha.syrup = "Chocolate"
    mocha.getCup
    mocha.pourShots
    mocha.addMilk
    mocha.addSyrup
    println(mocha.result)
  }
}
