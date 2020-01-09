package ReachingIntoJava
import org.apache.commons.math3._
import stat.regression.SimpleRegression

object LinearRegression {
  def main(args: Array[String]): Unit = {
    val r = new SimpleRegression
    r.addData(1, 1)
    r.addData(2, 1.1)
    r.addData(3, 0.9)
    r.addData(4, 1.2)
    println(r.getN)
    println(r.predict(6))
  }
}
