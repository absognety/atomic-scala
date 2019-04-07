package MoreConditionals

/**
  * Created by cvikas10 on 4/7/2019.
  */
object problem02 {
  def main(args: Array[String]): Unit = {
    def isPalindrome(word:String): Boolean={
      if (word.reverse==word) {
        return (true)
      }
      else {return false}
    }
    println(isPalindrome("mom"))
    println(isPalindrome("dad"))
    println(isPalindrome("ABCDCBA"))
  }
}
