package Sets

import Sets.Solution01._
object Solution02 {
  val vegetarian = Set("kidney beans",
    "black beans", "tofu")
  val proteins = meats.union(vegetarian)
  val groceryCart2 = Set("apple",
    "pretzels", "bread", "orange", "beef",
    "beans", "asparagus", "sweet potatoes",
    "kidney beans", "black beans")
  def percentVegetarian(gCart:Set[String]): Double = {
    (gCart.intersect(vegetarian)).size.toFloat/gCart.size * 100
  }
  def percentProtein(gCart:Set[String]): Double = {
    (gCart.intersect(proteins)).size.toFloat/gCart.size * 100
  }

  def main(args: Array[String]): Unit = {
    println (percentMeat(groceryCart2))
    println (percentVegetarian(groceryCart2))
    println (percentProtein(groceryCart2).round)
  }
}
