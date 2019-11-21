package Comprehensions

object Solution6 {
  def main(args: Array[String]): Unit = {
    def Activity(x:String*): Vector[String]={
      x.toVector
    }
    def getActivities(z:String,y:Vector[Vector[String]]): Unit={
      val ans = y.filter(V => V(0) == z)
      val new_ans = ans.map(x => x(1))
      println(new_ans)
    }
    var activities = Vector(
      Activity("01-01", "Run"),
      Activity("01-03", "Ski"),
      Activity("01-04", "Run"),
      Activity("01-10", "Ski"),
      Activity("01-03", "Run"))
    getActivities("01-01",activities)
    getActivities("01-02", activities)
    getActivities("01-03", activities)
    getActivities("01-04", activities)
    getActivities("01-10", activities)
  }
}
