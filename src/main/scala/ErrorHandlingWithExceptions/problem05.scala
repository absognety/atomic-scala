package ErrorHandlingWithExceptions

class feclass extends Exception
class seclass extends Exception
class teclass extends Exception

object problem05 {
  def fthrow(c:Int) = {
    if (c == -1) {throw new feclass}
    else if (c == 0) {throw new seclass}
    else if (c == 1) {throw new teclass}
    else {throw new Exception}
  }
  def handleex(h:Int) = {
    try {
      fthrow(h)
    } catch {
      case e:feclass => "first exception!"
      case e:seclass => "second exception"
      case e:teclass => "third exception"
      case _ => "unknown exception"
    }
  }

  def main(args: Array[String]): Unit = {
    println (handleex(-1))
    println (handleex(0))
    println (handleex(1))
    println (handleex(34))
  }
}
