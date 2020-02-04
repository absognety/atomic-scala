package ListsAndRecursion

class reimplement {
  def sumIt(numbers:List[Int]): Int={
    val total = numbers.sum
    total
  }
}
object Solution03 {
  def main(args: Array[String]): Unit = {
    val rimpt = new reimplement
    println(rimpt.sumIt(List(1, 2, 3)))
    println(rimpt.sumIt(List(45, 45, 45, 60)))
  }
}
