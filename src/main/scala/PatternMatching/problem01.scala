package PatternMatching

/**
  * Created by cvikas10 on 4/20/2019.
  */
object problem01 {
  def main(args: Array[String]): Unit = {
    def matchColor(color:String): String={
      if (color=="red") {
        return ("RED")
      }else if(color=="blue") {
        return ("BLUE")
      }else if(color=="green") {
        return ("GREEN")
      }else {return ("UNKNOWN COLOR: " + color)}
    }
    println(matchColor("white"))
    println(matchColor(("green")))
  }
}
