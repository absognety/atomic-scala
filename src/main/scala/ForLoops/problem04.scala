package ForLoops

/**
  * Created by cvikas10 on 4/6/2019.
  */
object problem04 {
  def main(args: Array[String]): Unit = {
    var totalEvens = 0
    for (m <- Range(0,10).inclusive) {
      if (m%2 == 0) {
        totalEvens += m
      }
    }
    println(totalEvens)
    assert(totalEvens==30,"Got" + totalEvens + ",Expected " + 30)
  }
}
