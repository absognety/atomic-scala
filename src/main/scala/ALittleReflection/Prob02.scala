package ALittleReflection

import Name._
object Prob02 {
  class anotherClass
}

object testProb02 {
  import Prob02._
  class anotherClass2 extends Name

  def main(args: Array[String]): Unit = {
    val newClass2 = new anotherClass2
    println(newClass2.toString)
    val newClass3 = new anotherClass
    println(newClass3.toString)
  }
}
/*
output:

anotherClass2
ALittleReflection.Prob02$anotherClass@22356acd
 */