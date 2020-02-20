package HandingNonValuesWithOption

object solution04 {
  def alphanumeric(x:Any): Option[Any] = {
    x match {
      case x if (('a' to 'z').contains(x) || ('A' to 'Z').contains(x) || (0 to 9).contains(x)) => Some(x)
      case _ => None
    }
  }

  def main(args: Array[String]): Unit = {
    println (alphanumeric(0))
    println (alphanumeric('a'))
    println (alphanumeric('m'))
    println (alphanumeric('$'))
    println (alphanumeric('Z'))
  }
}
