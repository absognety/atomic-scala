package ConstructorsandExceptions

import codelisting.ExtensionException
import codelisting.CodeListing._
import codelisting.CodeListing
object problem01 {
  def main(args: Array[String]): Unit = {
    val reader = new CodeListing("/home/vikas/atomic-scala/src/main/scala/ConstructorsandExceptions/codelisting/CodeListing.scala")
    reader.vec.foreach(println)
  }
}
