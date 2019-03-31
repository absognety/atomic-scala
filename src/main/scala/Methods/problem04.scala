package Methods

/**
  * Created by cvikas10 on 3/31/2019.
  */
object problem04 {
  def main(args: Array[String]): Unit = {
    def stringLowerCase(x:String): String={
      x.toLowerCase()
    }
    val z = stringLowerCase("abracaDaBRA")
    println(z)
    assert(z == "abracadabra","validated here")
    val w = stringLowerCase("zyxwVUT")
    println(w)
    assert(w == "zyxwvut","validated here")
  }
}
