package CustomErrorReporting.codelistingtester
import java.io.Serializable
class CodeListingTester(makeList:String => IndexedSeq[Serializable]) {
  println (makeList("CodeListingTester.scala")(4))
  println (makeList("NotAFile.scala")(0))
  println (makeList("NotAScalaFile.txt")(0))
  println (makeList(null)(0))
}
