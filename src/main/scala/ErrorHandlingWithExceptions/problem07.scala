package ErrorHandlingWithExceptions

class exceptclass extends Exception
class baseclass(x:Int) {
  def f = if(x > 10) {throw new exceptclass} else {throw new Exception}
}
class derivedclass(x:Int) extends baseclass(x) {
  def g = super.f
}
object problem07 {
  def main(args: Array[String]): Unit = {
    val r = new baseclass(23)
    val s = new derivedclass(9)
    //s.g //-> cannot handle exceptions thrown by base class
  }
}
