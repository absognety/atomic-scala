package NamedandDefaultArguments

/**
  * Created by cvikas10 on 4/20/2019.
  */
object problem03 {
  def main(args: Array[String]): Unit = {
    class Planet(name:String,description:String,moons:Int=1) {
      var hasMoon = false
      if (moons > 0) {hasMoon = true}
    }
    val p = new Planet(name = "Mercury", description = "small and hot planet", moons = 0)
    println(p.hasMoon)
    val p1 = new Planet(name = "Jupiter", description = "Large and cold planet", moons = 3)
    println(p1.hasMoon)
  }
}
