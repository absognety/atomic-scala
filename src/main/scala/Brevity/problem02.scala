package Brevity

object problem02 {
  def main(args: Array[String]): Unit = {
    def assignResult(arg:Boolean):Int = {
      //intermediate variable result is being used here.
      val result = if(arg) 42 else 47
      result
    }
    println(assignResult(true))
    def assignResult2(arg:Boolean):Int = if(arg) 42 else 47
    println(assignResult2(true))
    println(assignResult2(false))
  }
}
