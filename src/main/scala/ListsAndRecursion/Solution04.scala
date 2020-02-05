package ListsAndRecursion

class recursiveFreq {
  def calcFreq(x:List[String],word:String): Int = {
    if (x.isEmpty) {0}
    else if (x(0) == word) {
      1 + calcFreq(x.tail,word)
    }
    else {
      0 + calcFreq(x.tail,word)
    }
  }
}
object driver {
  def main(args: Array[String]): Unit = {
    val animalList = List("cat","dog","dog","elephant","lion","cat","cat")
    val recurclass = new recursiveFreq
    println (recurclass.calcFreq(animalList,"cat"))
    println (recurclass.calcFreq(animalList,"dog"))
    println (recurclass.calcFreq(animalList,"elephant"))
  }
}

