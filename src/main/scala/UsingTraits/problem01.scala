package UsingTraits

object problem01 {
  trait WIFI {
    val reportStatus = "working"
    val address = "192.168.0.200"
  }
  class Camera {
    val showImage = "Showing video"
  }
  class WIFICamera extends Camera with WIFI

  def main(args: Array[String]): Unit = {
    val webcam = new WIFICamera
    println (webcam.showImage)
    println (webcam.address)
    println (webcam.reportStatus)
  }
}
