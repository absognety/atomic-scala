package ErrorHandlingWithExceptions

import java.lang.NullPointerException
class simpleClass {
  def f:Any = "hello!"
}
object problem02 {
  def main(args: Array[String]): Unit = {
    var s:simpleClass = null
    /*
    println (s.f)
    Exception in thread "main" java.lang.NullPointerException
    at ErrorHandlingWithExceptions.problem02$.main(problem02.scala:9)
    at ErrorHandlingWithExceptions.problem02.main(problem02.scala)
     */
    /*
    Handling the above exception as below
     */
    def callf(y:simpleClass) = {
      try {
        println (y.f)
      } catch {
        case ex:NullPointerException => println ("Null Pointer Exception")
      }
    }
    callf(s)
  }
}