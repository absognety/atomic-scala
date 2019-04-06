package Fields

/**
  * Created by cvikas10 on 4/6/2019.
  */
object problem03 {
  def main(args: Array[String]): Unit = {
    class Cup4 {
      var percentFull = 0
    }
    val cup4 = new Cup4
    cup4.percentFull = 56
    assert(cup4.percentFull==56,"Not matched")
  }
}
