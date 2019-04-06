package Fields

/**
  * Created by cvikas10 on 4/6/2019.
  */
object problem04 {
  def main(args: Array[String]): Unit = {
    class Cup5 {
      var percentFull = 0
      def set(X:Int): Unit={
        percentFull=X
      }
      def get(): Int={
        percentFull
      }
    }
    val cup5 = new Cup5
    cup5.set(56)
    println(cup5.get())
    cup5.set(100)
    println(cup5.get())
  }
}
