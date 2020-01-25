package UsingTraits

import UsingTraits.problem04.ArtPeriod
object problem05 {
  class Painting(val comment:String,val year:Double) extends ArtPeriod {
    def period = {
      if (this.year < 1300) {"Pre-Renaissance"}
      else if ((this.year >= 1300) && (this.year <= 1599)) {"Renaissance"}
      else if ((this.year >= 1600) && (this.year <= 1699)) {"Baroque"}
      else if ((this.year >= 1700) && (this.year <= 1789)) {"Late Baroque"}
      else if ((this.year >= 1790) && (this.year <= 1880)) {"Romanticism"}
      else if ((this.year >= 1881) && (this.year <= 1970)) {"Modern"}
      else if (this.year >= 1971) {"Contemporary"}
    }
  }

  def main(args: Array[String]): Unit = {
    val painting =
      new Painting("The Starry Night", 1889)
    println (painting.period)
  }
}
