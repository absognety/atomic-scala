package BaseClassInitialization

object solution04 {
  def main(args: Array[String]): Unit = {
    class House(val address:String,
                val state:String, val zip:String) {
      def this(state:String, zip:String) =
        this("address?", state, zip)
      def this(zip:String) =
        this("address?", "state?", zip)
    }
    class VacationHouse(state:String,zip:String,val startMonth:Int,val endMonth:Int)
      extends House(state,zip) {
      def matchMonth(month:Int): String={
        month match {
          case 1 => "January"
          case 2 => "February"
          case 3 => "March"
          case 4 => "April"
          case 5 => "May"
          case 6 => "June"
          case 7 => "July"
          case 8 => "August"
          case 9 => "September"
          case 10 => "October"
          case 11 => "November"
          case 12 => "December"
        }
      }
      override def toString = s"Rented house in $state for " +
        s"months of ${matchMonth(startMonth)} through ${matchMonth(endMonth)}"
    }
    val v = new VacationHouse("MI","49431",6,8)
    println(v.toString)
    val u = new VacationHouse("MI","49431",1,4)
    println(u.toString)
  }
}