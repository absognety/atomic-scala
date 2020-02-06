package Sets

object Solution01 {
  val fruits = Set("apple", "orange",
    "banana", "kiwi")
  val vegetables = Set("beans", "peas",
    "carrots", "sweet potatoes",
    "asparagus", "spinach")
  val meats = Set("beef", "chicken")
  val groceryCart = Set("apple",
    "pretzels", "bread", "orange", "beef",
    "beans", "asparagus", "sweet potatoes",
    "spinach", "carrots")
  def percentMeat(gCart:Set[String]): Double = {
    (gCart.intersect(meats)).size.toFloat/gCart.size * 100
  }
  def percentFruit(gCart:Set[String]): Double = {
    (gCart.intersect(fruits)).size.toFloat/gCart.size * 100
  }
  def percentVeggies(gCart:Set[String]): Double = {
    (gCart.intersect(vegetables)).size.toFloat/gCart.size * 100
  }
  def percentOther(gCart:Set[String]): Double = {
    100 - (percentMeat(gCart)+percentFruit(gCart)+percentVeggies(gCart))
  }

  def main(args: Array[String]): Unit = {
    println (percentMeat(groceryCart))
    println (percentFruit(groceryCart))
    println (percentVeggies(groceryCart))
    println (percentOther(groceryCart))
  }
}
