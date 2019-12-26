package CompanionObjects

object Solution2 {
  def main(args: Array[String]): Unit = {
    class WalkActivity
    object WalkActivity {
      var log:String = ""
      def start(name:String): Unit={log += " " + s"[$name]_Activity_Started"}
      def stop(name:String): Unit={log += " " + s"[$name]_Activity_Stopped"}
    }
    WalkActivity.start("Sally")
    WalkActivity.start("John")
    WalkActivity.start("Vikas")
    WalkActivity.stop("Vikas")
    println(WalkActivity.log)
  }
}
