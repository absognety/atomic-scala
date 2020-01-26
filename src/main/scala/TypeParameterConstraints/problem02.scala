package TypeParameterConstraints

class WithF {
  def f(n:Int) = n * 11
}

object testMethod {
  def CallF[T <: WithF](t:T,n:Int): Int= {
    t.f(n)
  }
}

object problem02 {
  import testMethod._
  def main(args: Array[String]): Unit = {
    println (CallF(new WithF,2))
    println (CallF(new WithF,5))
    println (CallF(new WithF,10))
    println (CallF(new WithF{override def f(n:Int) = n * 7},2))
    println (CallF(new WithF{override def f(n:Int) = n * 7},5))
    println (CallF(new WithF{override def f(n:Int) = n * 7},10))
  }
}
