package Applications

object solution03 extends App {
  def monitor(charge:Int)={
    if (charge > 40) {"green"}
    else if ((charge >= 20) && (charge <= 39)) {"yellow"}
    else {"red"}
  }
  for(arg <- args) {
    println(monitor(arg.toInt))
  }
}
/*
1. scalac solution03.scala
2. scala Applications.solution03 80 30 10
 */