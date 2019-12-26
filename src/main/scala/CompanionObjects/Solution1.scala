package CompanionObjects

object Solution1 {
  def main(args: Array[String]): Unit = {
    class WalkActivity
    object WalkActivity {
      def start(name:String): Unit={
        println("Started!")
      }
    }
    WalkActivity.start("vikas")
  }
}
//don't have to instantiate the object WalkActivity