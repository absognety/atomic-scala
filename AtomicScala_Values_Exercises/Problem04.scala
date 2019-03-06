package AtomicScala_Values_Exercises

/**
  * Created by cvikas10 on 3/6/2019.
  */
object Problem04 extends App{
  val str = "ABC1234"
  """if we try to reassign str = DEF1234
    |then the error will be reassignment to val
  """.stripMargin
  var another_str = "ABC1234"
  another_str = "DEF1234"
  println(another_str)
  println(str)
}
