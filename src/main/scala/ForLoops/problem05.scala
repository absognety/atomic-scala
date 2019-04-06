package ForLoops

/**
  * Created by cvikas10 on 4/6/2019.
  */
object problem05 {
  def main(args: Array[String]): Unit = {
    var totalEvens = 0
    var totalOdds = 0
    for (m <- Range(0,10).inclusive) {
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
