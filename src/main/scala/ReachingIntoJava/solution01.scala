package ReachingIntoJava
import java.text.SimpleDateFormat
import java.util.Calendar
object solution01 {
  def main(args: Array[String]): Unit = {
    val datePattern = new SimpleDateFormat("MM/dd/yy")
    val parsed = datePattern.parse("05/01/12")
    val c = Calendar.getInstance()
    c.setTime(parsed)
    println(c.get(Calendar.DATE))
    println(c.get(Calendar.MONTH))
  }
}
/* different way of implementation
using Java calendar
 */