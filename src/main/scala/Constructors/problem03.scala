package Constructors

/**
  * Created by cvikas10 on 5/12/2019.
  */
object problem03 {
  def main(args: Array[String]): Unit = {
    class Tea(milk:Boolean=false,sugar:Boolean=false,decaf:Boolean=false,name:String="Earl Grey") {
      var MILK = milk
      var SUGAR = sugar
      var DECAF = decaf
      var NAME=name
      def describe(): Unit={
        if (DECAF)
          println(NAME + " " + "decaf")
        else if (MILK==true && SUGAR==false)
          println(NAME + " + " + "milk")
        else if (MILK==false && SUGAR==true)
          println(NAME + " + " + "sugar")
        else if (MILK==true && SUGAR==true)
          println(NAME + " + " + "milk" + " + " + "sugar")
        else
          println(NAME)
      }
      def calories(): Double={
        var CALORIES = 0
        if (MILK==true && SUGAR==false) {
          CALORIES += 100
        }else if (MILK==false && SUGAR==true) {
          CALORIES += 16
        }else if (MILK==true && SUGAR==true) {
          CALORIES += 116
        }
        CALORIES
      }
    }
    val tea = new Tea
    tea.describe()
    println(tea.calories())
    println(tea.NAME)

    val lemonZinger = new Tea( decaf = true, name="Lemon Zinger")
    lemonZinger.describe()
    println(lemonZinger.calories())
    println(lemonZinger.DECAF)

    val sweetGreen = new Tea( name="Jasmine Green", sugar=true)
    sweetGreen.describe()
    println(sweetGreen.calories())
    println(sweetGreen.SUGAR)

    val teaLatte = new Tea( sugar=true, milk=true)
    teaLatte.describe()
    println(teaLatte.calories())
    println(teaLatte.MILK)
  }
}
