package ErrorHandlingWithExceptions

class independent(val s1:String) extends Exception(s1) {
  def display = s1
}
object problem04 {
  def test(x:String) = {
    try{
      throw new independent(x)
    } catch {
      case e:independent => e.display
    }
  }
  def main(args: Array[String]): Unit = {
    println (test("hello!"))
    println (test("Welcome!"))
  }
}
