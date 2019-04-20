package NamedandDefaultArguments

/**
  * Created by cvikas10 on 4/20/2019.
  */
object problem05 {
  def main(args: Array[String]): Unit = {
    class FlexibleFamily(mom:String,dad:String,children:String*) {
      var MOM = mom
      var DAD = dad
      var CHILDREN = children
      def familySize(): Int={
        var count = 0
        for (c <- children) {
          count += 1
        }
        count + 2
      }
    }
    val family = new FlexibleFamily("Mom","Dad",children = "Emily","Joe")
    println(family.MOM)
    println(family.DAD)
    println(family.CHILDREN)
  }
}
//class FlexibleFamily(mom:String="Mom",dad:String="Dad",children:String*)
/* This will produce an error - A parameter section with a '*'-parameter is not
allowed to have default parameters
 */