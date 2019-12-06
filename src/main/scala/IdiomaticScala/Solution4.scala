package IdiomaticScala

object Solution4 {
  def main(args: Array[String]): Unit = {
    def addMultiply(x:Int,
                    y:Double, s:String)={
      println(s)
      (x + y) * 2.1
    }
    val r2 = addMultiply(7, 9, "Inside addMultiply")
    println(r2)
  }
}
