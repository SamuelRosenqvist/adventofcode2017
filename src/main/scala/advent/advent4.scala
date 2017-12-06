package advent
import scala.io.Source

object advent4 extends App {
    val phrases = Source.fromFile("passphrases").getLines.toArray
    var total = 0
    var anagramtotal = 0

    for(temps <- phrases){
        if(temps.split(" ").distinct.size == temps.split(" ").size) total += 1
        if(temps.split(" ").map(_.sorted).distinct.size == temps.split(" ").size) anagramtotal += 1
    }

    println(total)
    println(anagramtotal)
}