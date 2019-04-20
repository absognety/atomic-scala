package NamedandDefaultArguments

/**
  * Created by cvikas10 on 4/20/2019.
  */
object problem04 {
  def main(args: Array[String]): Unit = {
    class Planet(name:String,description:String,moons:Int=1) {
      var hasMoon = false
      if (moons > 0) {hasMoon = true}
    }
    val earth = new Planet(moons = 1, name = "Earth", description = "a hospitable planet")
    println(earth.hasMoon)
  }
}
//Doesn't have to change any code, with named arguments changing the order also works!!!!