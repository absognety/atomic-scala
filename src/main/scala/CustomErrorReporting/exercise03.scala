package CustomErrorReporting
import scala.util.Success

class failure(msg:String) extends Exception(msg) {
  override def toString: String = s"Failure($msg)"
}
object exercise03 {
  def testArgs(x:Boolean,y:String): Any ={
    if (x == false) {
      new failure(y)
    }
    else {""}
  }
  def f(s:String,i:Int,d:Double) = {
    var container = Vector(testArgs(s.length > 0, "s must be non-zero length"))
    container = container :+ testArgs(s.length <= 10, "length of s must be <= 10")
    container = container :+ testArgs(i >= 0, "i must be positive")
    container = container :+ testArgs(d < 0.9, "d must be < 0.9")
    container = container :+ testArgs(d > 0.1, "d must be > 0.1")
    val res = container.filter(x => x!="")
    res
  }
  def main(args: Array[String]): Unit = {
    println (f("foo",11,0.5))
    println (f("foobarbazbingo", 11, 0.5))
    println (f("", 11, 0.5))
    println (f("foo", -11, 0.5))
    println (f("foo", 11, 0.1))
    println (f("foo", 11, 0.9))
  }
}
