package ErrorHandlingWithExceptions

object problem03 {
  def main(args: Array[String]): Unit = {
    val myvector = Vector(1,2,4,5)
    def IndexOutOfBounds(index:Int,h:Vector[Int]) = {
      val vlen = h.length
      try {
        println (h(index))
      } catch {
        case ex:IndexOutOfBoundsException => if (index >= vlen)
        {println (s"Given index is more than or equal to $vlen")} else if (index <= -1) {println (s"Given index is less than or equal to -1")}
      }
    }
    IndexOutOfBounds(1,myvector)
    IndexOutOfBounds(2,myvector)
    IndexOutOfBounds(3,myvector)
    IndexOutOfBounds(4,myvector)
    IndexOutOfBounds(10,myvector)
    IndexOutOfBounds(-23,myvector)
    IndexOutOfBounds(-2,myvector)
  }
}
