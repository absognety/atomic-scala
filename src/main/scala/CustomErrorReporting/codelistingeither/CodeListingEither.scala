package CustomErrorReporting.codelistingeither

import ConstructorsandExceptions.codelisting._
import java.io.FileNotFoundException
import util.{Success,Failure}

class customException(msg:String) extends Exception(msg)
object CodeListingEither {
  def apply(name:String) =
    try {
      Success(new CodeListing(name))
    } catch {
      case _:FileNotFoundException =>
        Failure(new customException(s"File Not Found: $name"))
      case _:NullPointerException =>
        Failure(new customException("Error: Null file name"))
      case e:ExtensionException =>
        Failure(new customException(e.getMessage))
    }
}
