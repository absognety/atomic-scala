package BaseClassInitialization

object solution03 {
  def main(args: Array[String]): Unit = {
    class House(val address:String,
                val state:String, val zip:String) {
      def this(state:String, zip:String) =
        this("address?", state, zip)
      def this(zip:String) =
        this("address?", "state?", zip)
    }
    class Home(address:String, state:String,
               zip:String, val name:String,val heart:Boolean=true)
      extends House(address, state, zip) {
      override def toString = "where the heart is"
    }
    val home = new Home("417 Ottoman Road","Texas","56888","sweet home")
    println(home.toString)
    println(home.heart)
  }
}
