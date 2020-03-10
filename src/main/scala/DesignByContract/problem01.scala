package DesignByContract
import scala.util.Try
class contractual {
  def func(s:String) = {
    require(s.length >= 4 && s.length <= 10,
            "length of given s should between 4 and 10")
    s.foreach(x => require(x.isDigit,"there is a character which " +
      "is not a digit"))
    println (s)
    val news = s.split("").map(y => y.toInt)
    println (news.sum)
  }
  def testfunc(s:String) = {
    try{
      func(s)
    } catch {
      case e:IllegalArgumentException => println (e.getMessage)
    }
  }
}
object problem01 {
  def main(args: Array[String]): Unit = {
    val cont = new contractual
    cont.testfunc("1234")
    cont.testfunc("1445")
    cont.testfunc("1abba8899")
    cont.testfunc("ab")
  }
}
