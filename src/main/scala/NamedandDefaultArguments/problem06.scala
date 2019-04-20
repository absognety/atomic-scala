package NamedandDefaultArguments

/**
  * Created by cvikas10 on 4/20/2019.
  */
object problem06 {
  def main(args: Array[String]): Unit = {
    class Item(name:String,price:Double) {
      def cost(grocery:Boolean=false,medication:Boolean=false,taxRate:Double=0.10): Double={
        var totalCost = price * taxRate + price
        totalCost
      }
    }
    val flour = new Item(name="flour", 4)
    println(flour.cost(grocery = true))
    val sunscreen = new Item( name="sunscreen", 3)
    println(sunscreen.cost())
    val tv = new Item(name="television", 500)
    println(tv.cost(taxRate = 0.06))
  }
}
