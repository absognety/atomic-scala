package UsingTraits

object problem04 {
  trait ArtPeriod {
    def period(year:Double) = {
      if (year < 1300) {"Pre-Renaissance"}
      else if ((year >= 1300) && (year <= 1599)) {"Renaissance"}
      else if ((year >= 1600) && (year <= 1699)) {"Baroque"}
      else if ((year >= 1700) && (year <= 1789)) {"Late Baroque"}
      else if ((year >= 1790) && (year <= 1880)) {"Romanticism"}
      else if ((year >= 1881) && (year <= 1970)) {"Modern"}
      else if (year >= 1971) {"Contemporary"}
    }
  }
  class artPeriod extends ArtPeriod
  def main(args: Array[String]): Unit = {
    val art = new artPeriod
    println (art.period (1400))
    println (art.period(1650))
    println (art.period(1279))
  }
}
