package MethodsInsideClasses

/**
  * Created by cvikas10 on 4/2/2019.
  */
object problem02 {
  def main(args: Array[String]): Unit = {
    class Flare {
      def light(): String={"Flare used!"}
    }
    val flare = new Flare
    val f1 = flare.light()
    assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)
  }
}
