package Traits

import Traits.solution01.BatteryPower
import Traits.solution02.Toy
object solution03 {
  def main(args: Array[String]): Unit = {
    val toy2 = new Toy with BatteryPower
    println(toy2.monitor(50))
  }
}
