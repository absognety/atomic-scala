package ErrorHandlingWithExceptions

import java.lang.ArithmeticException
object testfinally {
  def tfinal(a:Int,b:Int) = {
    try {
      a/b
    } catch {
      case e:ArithmeticException => "Division by 0 not possible!"
    } finally {
      println ("Operation finished")
    }
  }
}
object problem10 {
  import testfinally._
  def main(args: Array[String]): Unit = {
    println (tfinal(40,60))
    println (tfinal(4,0))
    println (tfinal(40,20))
  }
}
/*
OUTPUT:

Operation finished
0
Operation finished
Division by 0 not possible!
Operation finished
2

finally block executed at all scenarios
 */