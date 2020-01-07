package UniformAccessandSetters

object problem03 {
  class ex {
    var n = 1
  }
  class sample extends ex {
    var internal:Int = 0
    def getter={this.internal}
    def setter = n
    def setter_=(newVal:Int)=this.internal = newVal
  }

  def main(args: Array[String]): Unit = {
    val Sample = new sample
    println(Sample.getter)
    Sample.setter = 23
    println(Sample.getter)
    Sample.setter = 56
    println(Sample.getter)
  }
}
