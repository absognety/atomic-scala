package compound_Expressions
import scala.collection.immutable._

/**
  * Created by cvikas10 on 3/24/2019.
  */
object problem03 {
  def main(args: Array[String]): Unit = {
    val activity: List[String] = List("swimming", "biking", "walking", "couch")
    val temperature: List[Boolean] = List(true, false)
    val isOpen: List[Boolean] = List(true, false)
    val cross = activity.flatMap(x => temperature.map(y => (x, y)))
    var cross_final = cross.flatMap(x => isOpen.map(y => (x, y)))
    for (l <- cross_final) {
      var temp = l._1
      println(temp._1,temp._2,l._2,temp._2 && l._2)
    }
  }
}