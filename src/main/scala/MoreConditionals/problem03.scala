package MoreConditionals

/**
  * Created by cvikas10 on 4/7/2019.
  */
object problem03 {
  def main(args: Array[String]): Unit = {
    def isPalIgnoreCase(word:String): Boolean={
      if (word.reverse.toLowerCase()==word.toLowerCase()) {
        return true
      }
      else {return false}
    }
    println(isPalIgnoreCase("Bob"))
    println(isPalIgnoreCase("DAD"))
    println(isPalIgnoreCase("Dad"))
    println(isPalIgnoreCase("Blob"))
  }
}
