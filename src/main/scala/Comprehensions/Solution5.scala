package Comprehensions

object Solution5 {
  def main(args: Array[String]): Unit = {
    def Activity(x:String*): Vector[String]={
      x.toVector
    }
    def getDates(z:String,y:Vector[Vector[String]]): Unit={
      val ans = y.filter(V => V(1) == z)
      val new_ans = ans.map(x => x(0))
      println(new_ans)
    }
    var activities = Vector(
      Activity("01-01", "Run"),
      Activity("01-03", "Ski"),
      Activity("01-04", "Run"),
      Activity("01-10", "Ski"),
      Activity("01-03", "Run"))
    getDates("Ski",activities)
    getDates("Run", activities)
    getDates("Bike", activities)
  }
}
