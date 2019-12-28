package BaseClassInitialization

object solution05 {
  def main(args: Array[String]): Unit = {
    class Trip(val origin:String,val destination:String,
               val startDate:String,val endDate:String) {
      override def toString = s"From $origin to $destination" +
        s": $startDate to $endDate"
    }
    class AirplaneTrip(origin:String,destination:String,
                       startDate:String,endDate:String,val nameMovie:String)
    extends Trip(origin,destination,startDate,endDate) {
      override def toString = s"On a flight from $origin to $destination" +
        s", we watched ${nameMovie}"
    }
    class CarTrip(val cities:Vector[String],startDate:String,endDate:String) {
      val origination = cities.head
      val destination = cities.last
      val startdate = startDate
      override def toString = s"from ${origination} to ${destination}" +
        s" ${startDate} to ${endDate}"
    }
    val t = new Trip("Detroit","Houston",
      "5/1/2012","6/1/2012")
    val a = new AirplaneTrip("Detroit",
      "London","9/1/1939",
      "10/31/1939", "Superman")
    val cities = Vector("Boston",
      "Albany","Buffalo","Cleveland",
      "Columbus","Indianapolis",
      "St. Louis", "Kansas City",
      "Denver","Grand Junction",
      "Salt Lake City","Las Vegas",
      "Bakersfield","San Francisco")
    val c = new CarTrip(cities,
      "6/1/2012","7/1/2012")
    println(t.toString)
    println(a.toString)
    println(c.origination)
    println(c.destination)
    println(c.startdate)
    println(c.toString)
  }
}
