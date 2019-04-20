package PatternMatching

/**
  * Created by cvikas10 on 4/20/2019.
  */
object problem03 {
  def main(args: Array[String]): Unit = {
    def checkTruth(exp1:Boolean,exp2:Boolean): Unit={
      var first = exp1 match {
        case true => "true"
        case _ => "false"
      }
      var second = exp2 match {
        case true => "true"
        case _ => "false"
      }
      if (first=="true" && second=="true") {
        println("Both are true")
      }else if (first=="true" && second=="false") {
        println("first: true, second: false")
      }else if (first=="false" && second=="true") {
        println("first: false, second: true")
      }else if (first=="false" && second=="false") {
        println("Both are false")
      }
    }
    checkTruth(true || false, true)
    checkTruth(1 > 0 && -1 < 0, 1 == 2)
    checkTruth(1 >= 2, 1 >= 1)
    checkTruth(true && false, false && true)
  }
}
