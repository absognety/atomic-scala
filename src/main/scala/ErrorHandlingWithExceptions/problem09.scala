package ErrorHandlingWithExceptions

class except1 extends Exception
class except2 extends except1
class except3 extends except2

class A {
  def f = throw new except1
}

class B extends A {
  override def f = throw new except2
}

class C extends B {
  override def f = throw new except3
}
object problem09 {
  def main(args: Array[String]): Unit = {
    val c_class = new C
    val a_class = c_class.asInstanceOf[C]
    val res = try {
      a_class.f
    } catch {
      case e:except3 => "handled except3 exception here!"
    }
    println (res)
  }
}
