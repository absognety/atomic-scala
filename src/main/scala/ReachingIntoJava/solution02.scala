package ReachingIntoJava

import java.text.SimpleDateFormat
import java.util.Calendar
object solution02 {
  def main(args: Array[String]): Unit = {
    val datePattern = new SimpleDateFormat("mm/dd/yy")
    val parsed = datePattern.parse("05/01/12")
    val c = Calendar.getInstance()
    c.setTime(parsed)
    println(c.get(Calendar.DATE))
    println(c.get(Calendar.MONTH))
  }
}
/*
Output here is 1 and 0 instead of 1 and 4 if we replace MM with mm.
mm is for minutes not for months
 */