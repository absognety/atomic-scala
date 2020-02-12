package ErrorHandlingWithExceptions

class cexception1 extends Exception
class cexception2 extends Exception
class createMethods {
  def f = try {
    g
  } catch {
    //case e:cexception1 => throw new cexception2
    case e:cexception1 => "Here call the new exception as above piece of code"
  }
  def g = throw new cexception1
}

object problem06 {
  def main(args: Array[String]): Unit = {
    val w = new createMethods
    println (w.f)
  }
}
