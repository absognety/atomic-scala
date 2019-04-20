package ClassArguments

/**
  * Created by cvikas10 on 4/20/2019.
  */
object problem01 {
  def main(args: Array[String]): Unit = {
    class Family(args:String*) {
      def familySize(): Int={
        var count=0
        for (m <- args) {
          count += 1
        }
        count
      }
    }
    val family1 = new Family("Mom","Dad","Sally","Dick")
    println(family1.familySize())
    val family2 = new Family("Dad","Mom","Harry")
    println(family2.familySize())
  }
}
