package Traits

import solution01.BatteryPower
object solution02 {
  class Toy extends BatteryPower
  class BatteryPoweredToy extends Toy with BatteryPower

  def main(args: Array[String]): Unit = {
    val toy = new BatteryPoweredToy
    println(toy.monitor(50))
    println(toy.monitor(10))
    println(toy.monitor(38))
  }
}
