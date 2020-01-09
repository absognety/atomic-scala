package ReachingIntoJava
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.TimeZone
object solution03 {
  def main(args: Array[String]): Unit = {
    val datePattern = new SimpleDateFormat("dd/MM/yy")
    val parsed = datePattern.parse("01/09/20")
    val timeZone = TimeZone.getTimeZone("Asia/Kolkata")
    val c = Calendar.getInstance()
    c.setTime(parsed)
    c.setTimeZone(timeZone)
    println(c.get(Calendar.MONTH))
    println(c.get(Calendar.DAY_OF_MONTH))
  }
}
/*
months count start from 0 - 11 instead of 1 - 12
use JODA-time instead of java time
 */