package ReferencesAndMutability

object Solution06 {
  class testVarChange(var sample:String) {
    def testVarMethod = {
      sample = "my name is Vikas"
      sample += ", and I am working."
      sample
    }
  }

  def main(args: Array[String]): Unit = {
    val mytest = new testVarChange("sample")
    println (mytest.testVarMethod)
  }
}
/*
reassignment to var is working fine, with no side affects.
 */
