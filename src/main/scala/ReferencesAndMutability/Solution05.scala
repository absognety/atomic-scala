package ReferencesAndMutability

object Solution05 {
  class testMutability(animalType:String) {
    def reassign = {
      //animalType = "Lion", Not permitted. scala uses val for method arguments
      //val animalType = animalType, Not permitted.
      /*
      recursive value animalType needs type
      val animalType = animalType
       */
      //var animalType = animalType, not permitted
      var testvar = animalType
      println (testvar)
      println (animalType + " is hunting")
    }
  }

  def main(args: Array[String]): Unit = {
    val test = new testMutability("Tiger")
    test.reassign
  }
}
