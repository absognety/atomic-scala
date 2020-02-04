package ListsAndRecursion

import scala.math.{max}
object Solution01 {
  class recursion {
    def maxElement(x:List[Int],n:Int): Int = {
      if (n == 1)
        x(0)
      else
        max(x(n-1),maxElement(x,n-1))
    }
  }
  def main(args: Array[String]): Unit = {
    val aList = List(10, 20, 45, 15, 30)
    val bList = List(-1000,-400,-300,-800,-300)
    val l = aList.length
    val m = bList.length
    val recur = new recursion
    println (recur.maxElement(aList,l))
    println(recur.maxElement(bList,m))
  }
}
