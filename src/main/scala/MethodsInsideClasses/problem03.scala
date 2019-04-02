package MethodsInsideClasses

/**
  * Created by cvikas10 on 4/2/2019.
  */
object problem03 {
  def main(args: Array[String]): Unit = {
    class Sailboat {
      def raise(): String={"Sails raised,"}
      def lower(): String={"Sails lowered,"}
      def signal(): String={
        class Flare {
          def light(): String={"Flare used!"}
        }
        var f = new Flare
        f.light()
      }
    }
    class Motorboat {
      def start(): String= {"Motor on,"}
      def stop(): String={"Motor off,"}
      def signal(): String={
        class Flare {
          def light(): String={"Flare used!"}
        }
        var g = new Flare
        g.light()
      }
    }
    val sailBoat = new Sailboat
    println(sailBoat.signal())

    val motorBoat = new Motorboat
    println(motorBoat.signal())
  }
}
