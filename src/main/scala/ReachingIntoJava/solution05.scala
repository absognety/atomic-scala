package ReachingIntoJava

import org.apache.commons.math3._
import stat.descriptive.SummaryStatistics
import stat.StatUtils
object solution05 {
  def main(args: Array[String]): Unit = {
    val s = new SummaryStatistics
    s.addValue(10)
    s.addValue(20)
    s.addValue(30)
    s.addValue(80)
    s.addValue(90)
    s.addValue(100)
    println(s.getMean)
    println(s.getStandardDeviation)
    println(StatUtils.percentile(Array(10,20,30,80,90,100),35))
  }
}
