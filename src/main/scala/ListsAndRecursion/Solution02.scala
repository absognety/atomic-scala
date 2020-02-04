package ListsAndRecursion

import ListsAndRecursion.Solution01.recursion
object Solution02 {
  class recursion2 extends recursion {
    def sumIt(toSum:List[Int], sum:Int=0):Int = {
      println (toSum,sum)
      if(toSum.isEmpty)
        sum
      else
        sumIt(toSum.tail, sum + toSum.head)
    }
  }

  def main(args: Array[String]): Unit = {
    val recur2 = new recursion2
    recur2.sumIt(List(10, 20, 30, 40, 50))
  }
}
