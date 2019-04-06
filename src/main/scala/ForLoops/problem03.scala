package ForLoops

/**
  * Created by cvikas10 on 4/6/2019.
  */
object problem03 {
  def main(args: Array[String]): Unit = {
    var total = 0
    for (m <- Range(0,11)) {
      total += m
    }
    println(total)
    assert(total==55,"sum is not matched" + 55)
  }
}
