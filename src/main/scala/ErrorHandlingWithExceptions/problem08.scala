package ErrorHandlingWithExceptions

import java.lang.NullPointerException
import java.lang.IllegalStateException
class myexception extends Exception
class FailingConstructor(val a:myexception = null) {
  def b = if (a == null) {throw a} else {throw new IllegalStateException}
}
object problem08 {
  def handlefcons(q:myexception) = try{
    (new FailingConstructor(q)).b
  } catch {
    case e:myexception => "handling the exception here!"
    case e:NullPointerException => "Null pointer exception"
    case e:IllegalStateException => "Constructor Failure"
  }
  def main(args: Array[String]): Unit = {
    println (handlefcons(null))
    val newtest = new myexception
    println (handlefcons(newtest))
  }
}
