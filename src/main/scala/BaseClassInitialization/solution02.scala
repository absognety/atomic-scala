package BaseClassInitialization

object solution02 {
  def main(args: Array[String]): Unit = {
    class GreatApe {
      var weight = 100
      var height = 5
      def bmi(weight:Int,height:Int): Long= {weight/(height*height)}
    }
    class Bonobo extends GreatApe
    val greatape = new GreatApe
    println(s"Great Ape height ${greatape.height}")
    println(s"Great Ape weight ${greatape.weight}")
    println (greatape.bmi(greatape.weight,greatape.height))
    val bonobo = new Bonobo
    bonobo.height = 6
    bonobo.weight = 120
    println(s"Bonobo height ${bonobo.height}")
    println(s"Bonobo weight ${bonobo.weight}")
    println(bonobo.bmi(bonobo.weight,bonobo.height))
  }
}
