package ForLoops

/**
  * Created by cvikas10 on 4/6/2019.
  */
object problem06 {
  def main(args: Array[String]): Unit = {
    var totalEvens = 0
    var totalOdds = 0
    for (m <- 0 to 10) {
      if (m%2 == 0) {
        totalEvens += m
      }
      if (m%2 != 0) {
        totalOdds += m
      }
    }
    println(totalEvens)
    println(totalOdds)
    assert(totalEvens==30)
    assert(totalOdds==25)
  }
}
