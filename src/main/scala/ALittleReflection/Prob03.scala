package ALittleReflection

import scala.reflect.runtime.currentMirror
object Name {
  def className(o:Any) =
    currentMirror.reflect(o).symbol.toString
  trait Name {
    override def toString = Name.className(this)
  }
}

import Name._
object Prob03 {
  class anotherClass
}

object testProb03 {
  import Prob03._
  class anotherClass2 extends Name

  def main(args: Array[String]): Unit = {
    val newClass2 = new anotherClass2
    println(newClass2.toString)
    val newClass3 = new anotherClass
    println(newClass3.toString)
  }
}
