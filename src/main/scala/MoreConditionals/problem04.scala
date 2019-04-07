package MoreConditionals

/**
  * Created by cvikas10 on 4/7/2019.
  */
object problem04 {
  def main(args: Array[String]): Unit = {
    val givenString = "Madam I'm adam"
    def isPalIgnoreCase(word:String): Boolean={
      if (word.reverse.toLowerCase()==word.toLowerCase()) {
        return true
      }
      else {return false}
    }
    var newString = givenString.replaceAll("[!@#$%^&*():;',./?{}|]","").toLowerCase()
    newString = newString.replace(" ","")
    println(newString)
    println(isPalIgnoreCase(newString))
  }
}
