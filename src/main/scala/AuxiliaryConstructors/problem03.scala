package AuxiliaryConstructors

// You can't put anything before the call to the primary constructor

object problem03 {
  def main(args: Array[String]): Unit = {
    class TryMe(val name:String) {
      def this() {
        //val someVal = 0
        this("DefaultName")
      }
    }
  }
}
/* OUTPUT_SHOULD_CONTAIN
error: 'this' expected but 'val' found.
    val someVal = 0
    ^
one error found
*/
