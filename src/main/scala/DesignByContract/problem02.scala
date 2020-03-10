package DesignByContract

object problem02 extends App {
  val alphabets = 'a' to 'z'
  val nums = 1 to 26
  val alphanum = alphabets.zip(nums).toMap
  object myapp {
    def cmdTask = {
      var string = args(0)
      string.toLowerCase.foreach(v => require(v.isLetter,"There is " +
        "a character which is not inherently a alphabet"))
      val transformed = string.toLowerCase.map(b => alphanum(b))
      transformed.sum
    }
  }
  println (myapp.cmdTask)
}
