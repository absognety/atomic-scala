package ConstructorsandExceptions

import codelisting.ExtensionException
import codelisting.CodeListing._
import codelisting.CodeListing
object problem02 {
  def main(args: Array[String]): Unit = {
    val reader = new CodeListing("/home/vikas/atomic-scala/src/main/scala/ConstructorsandExceptions/codelisting/CodeListing.scala")
    println (reader.getClass())
    val vlen = reader.vec.length
    println (vlen)
    ((1 to vlen).zip(reader.vec)).foreach(println)
  }
}
