package ClassArguments

/**
  * Created by cvikas10 on 4/20/2019.
  */
object problem02 {
  def main(args: Array[String]): Unit = {
    class FlexibleFamily(mom:String,dad:String,children:String*) {
      def familySize(): Int={
        var count = 0
        for (c <- children) {
          count += 1
        }
        count + 2
      }
    }
    val family1 = new FlexibleFamily("Mom","Dad","Sally","Dick")
    println(family1.familySize())
    val family2 = new FlexibleFamily("Dad", "Mom", "Harry")
    println(family2.familySize())
  }
}
