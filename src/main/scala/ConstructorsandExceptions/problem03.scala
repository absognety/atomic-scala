package ConstructorsandExceptions

import codelisting.ExtensionException
import codelisting.CodeListing._
import codelisting.CodeListing
object problem03 {
  def main(args: Array[String]): Unit = {
    val reader = apply("/home/vikas/atomic-scala/src/main/scala/ConstructorsandExceptions/codelisting/CodeListing.txt")
    println (reader(0))
  }
}
