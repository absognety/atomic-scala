package IdiomaticScala

object Solution5 {
  def main(args: Array[String]): Unit = {
    def checkTruth(exp1:Boolean, exp2:Boolean) = {
      if (exp1 && exp2) "Both are true"
      else if (!exp1 && !exp2) "Both are false"
      else if (exp1 && !exp2) "First: true, second: false"
      else "First: false, second: true"
    }
    println (checkTruth(true || false, true))
    println (checkTruth(1 > 0 && -1 < 0, 1 == 2))
    println (checkTruth(1 >= 2, 1 >= 1))
    println (checkTruth(true && false,false && true))
  }
}
