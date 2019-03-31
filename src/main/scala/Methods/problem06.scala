package Methods

/**
  * Created by cvikas10 on 3/31/2019.
  */
object problem06 {
  def main(args: Array[String]): Unit = {
    def manyTimesString(x:String,a:Int): String={
      x * a
    }
    val result1 = manyTimesString("abc",3)
    println(result1)
    val result2 = manyTimesString("123",2)
    println(result2)
  }
}
