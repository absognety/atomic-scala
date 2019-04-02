package MethodsInsideClasses

/**
  * Created by cvikas10 on 4/2/2019.
  */
object problem01 {
  def main(args: Array[String]): Unit = {
    class Sailboat {
      def raise(): String={"Sails raised,"}
      def lower(): String={"Sails lowered,"}
    }
    class Motorboat {
      def start(): String= {"Motor on,"}
      def stop(): String={"Motor off,"}
    }
    val sailboat = new Sailboat
    val r1 = sailboat.raise()
    assert(r1 == "Sails raised,", "Expected Sails raised, Got " + r1)
    val r2 = sailboat.lower()
    assert(r2 == "Sails lowered,", "Expected Sails lowered, Got " + r2)

    val motorBoat = new Motorboat
    val s1 = motorBoat.start()
    assert(s1 == "Motor on,", "Expected Motor on, Got " + s1)
    val s2 = motorBoat.stop()
    assert(s2 == "Motor off,", "Expected Motor off, Got " + s2)
  }
}
