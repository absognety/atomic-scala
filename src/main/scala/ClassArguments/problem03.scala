package ClassArguments

/**
  * Created by cvikas10 on 4/20/2019.
  */
object problem03 {
  def main(args: Array[String]): Unit = {
    class FamilyNoKids(mom:String,dad:String,children:String*) {
      def familySize(): Int={
        var childrenCount=0
        for (c <- children) {
          childrenCount += 1
        }
        childrenCount + 2 - childrenCount
      }
    }
    val family1 = new FamilyNoKids("Mom","Dad","John","James","Jennifer")
    println(family1.familySize())
    val family2 = new FamilyNoKids("Mom","Dad","Monica","Ross")
    println(family2.familySize())
  }
}
