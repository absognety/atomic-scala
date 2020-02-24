package ConvertingExceptionsWithTry
import ConstructorsandExceptions.codelisting._
import java.io.FileNotFoundException
object solution03 {
  def mapped(filename:String) = {
    val reader = new CodeListing(filename)
    val vlen = reader.vec.length
    ((1 to vlen).zip(reader.vec))
  }
  def listing(name:String) =
    try {
      mapped(name)
    } catch {
      case _:FileNotFoundException =>
        Vector(s"File Not Found: $name")
      case _:NullPointerException =>
        Vector("Error: Null file name")
      case e:ExtensionException =>
        Vector(e.getMessage)
    }

  def main(args: Array[String]): Unit = {
    val fname = "/home/vikas/atomic-scala/src/main/scala/ConstructorsandExceptions/codelisting/CodeListing.scala"
    println (listing(fname).mkString("\n"))
    val fname1 = "/home/vikas/atomic-scala/src/main/scala/ConstructorsandExceptions/codelisting/CodeListing.py"
    println (listing(fname1))
    val fname2 = "/home/vikas/sample.scala"
    println (listing(fname2))
    val fname3 = null
    println (listing(fname3))
  }
}
/*
OUTPUT should be:

(1,package ConstructorsandExceptions.codelisting)
(2,)
(3,import java.io.FileNotFoundException)
(4,class ExtensionException(name:String))
(5,  extends Exception()
(6,    s"$name doesn't end with '.scala'"))
(7,)
(8,class CodeListing(val fileName:String))
(9,  extends collection.IndexedSeq[String] {)
(10,  if(!fileName.endsWith(".scala")))
(11,    throw new ExtensionException(fileName))
(12,  val vec = io.Source.fromFile(fileName))
(13,    .getLines.toVector)
(14,  def apply(idx:Int) = vec(idx))
(15,  def length = vec.length)
(16,})
(17,)
(18,object CodeListing {)
(19,  def apply(name:String) =)
(20,    try {)
(21,      new CodeListing(name))
(22,    } catch {)
(23,      case _:FileNotFoundException =>)
(24,        Vector(s"File Not Found: $name"))
(25,      case _:NullPointerException =>)
(26,        Vector("Error: Null file name"))
(27,      case e:ExtensionException =>)
(28,        Vector(e.getMessage))
(29,    })
(30,})
Vector(/home/vikas/atomic-scala/src/main/scala/ConstructorsandExceptions/codelisting/CodeListing.py doesn't end with '.scala')
Vector(File Not Found: /home/vikas/sample.scala)
Vector(Error: Null file name)

 */
