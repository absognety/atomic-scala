package ReachingIntoJava

import org.apache.commons.math3._
import stat.Frequency
object solution04 {
  def main(args: Array[String]): Unit = {
    val f = new Frequency
    f.addValue('C')
    f.addValue('D')
    f.addValue('C')
    f.addValue('B')
    f.addValue('C')
    f.addValue('C')
    f.addValue('K')
    f.addValue('M')
    println(f.getCount('C'))
    println(f.getCount('K'))
  }
}