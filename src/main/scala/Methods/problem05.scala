package Methods

/**
  * Created by cvikas10 on 3/31/2019.
  */
object problem05 {
  def main(args: Array[String]): Unit = {
    def addStrings(x:String,y:String): String={
      x + y
    }
    val s1 = addStrings("abc","def")
    val s2 = addStrings("zyx","abc")
    println(s1,s2)
    assert(s1=="abcdef")
    assert(s2=="zyxabc")
  }
}
