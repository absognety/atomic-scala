package Maps

object problem02 {
  case class Name(firstName:String,lastName:String)
  def createMap(emailaddress:String): Map[String,Name]= {
    val tokens = emailaddress.split("@")
    val firstname = tokens(0)
    val lastname = tokens(1).split("\\.")(0)
    Map(emailaddress -> Name(firstname,lastname))
  }
}

object testSolution02 {
  import problem02._
  def main(args: Array[String]): Unit = {
    val m = createMap("sally@taylor.com")
    println(m)
    val n = createMap("john@smith.com")
    println(n)
  }
}
