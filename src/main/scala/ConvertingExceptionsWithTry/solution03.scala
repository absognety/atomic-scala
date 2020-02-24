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
