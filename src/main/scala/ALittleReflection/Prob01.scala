package ALittleReflection

import Name._
object Prob01 {
  case class anotherClass(a:Int)
}
object testProb01 {
  import Prob01._
  case class anotherClass2(b:Int) extends Name

  def main(args: Array[String]): Unit = {
    val newClass2 = new anotherClass2(23)
    println(newClass2.toString)
    val newClass3 = new anotherClass(56)
    println(newClass3.toString)
  }
}
/*
In the first println we are getting only the name of class without parameters
and in the second case class name along with parameter.
 */