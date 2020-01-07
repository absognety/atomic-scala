package Traits

object solution01 {
  trait BatteryPower {
    def monitor(charge:Int)={
      if (charge > 40) {"green"}
      else if ((charge >= 20) && (charge <= 39)) {"yellow"}
      else {"red"}
    }
  }
  trait EnergySource
  class Battery extends EnergySource with BatteryPower

  def main(args: Array[String]): Unit = {
    val battery = new Battery
    println(battery.monitor(80))
    println(battery.monitor(30))
    println(battery.monitor(10))
  }
}
