package Brevity

object problem03 {
  def main(args: Array[String]): Unit = {
    def assignResult(arg:Boolean):Int = {
      //intermediate variable result is being used here.
      val result = if(arg) 42 else 47
      result
    }
    println(assignResult(true))
    def assignResult3(arg:Boolean) = if(arg) 42 else 47
    println(assignResult3(true))
    println(assignResult3(false))
  }
}
