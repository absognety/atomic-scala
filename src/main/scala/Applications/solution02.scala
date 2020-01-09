package Applications

object solution02 extends App {
  class Battery {
    val charge:Int = 0
  }
  object Battery {
    def monitor(charge:Int)={
      if (charge > 40) {"green"}
      else if ((charge >= 20) && (charge <= 39)) {"yellow"}
      else {"red"}
    }
  }
  println(Battery.monitor(23))
  println(Battery.monitor(10))
}
