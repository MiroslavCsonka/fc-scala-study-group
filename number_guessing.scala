import scala.io.StdIn._
import scala.util.{Failure, Success, Try}
import scala.util.control.Breaks._

def generateValue: Int = (Math.random() * 10).round.toInt

def readNumber: Try[Int] = Try(readLine().toInt)

def readGameType: Int = {
  var gameType = 0
  while (!List(1, 2, 3).contains(gameType) ) {
    gameType = readNumber.get
  }
  gameType
//
//    // TODO: get rid of .get
//    if (List(1, 2, 3).contains(gameType.get)) {
//      error(gameType.get)
//    }
//  }
}

def promptForValue = println("Guess a number: ")

println("Select a game:")
println("1) guess the number")
println("2) guess the animal")
println("3) guess the color")

val gameType = readGameType

if (gameType == 1) {
  promptForValue

  val actual = generateValue

  while (true) {

    readNumber match {
      case Success(n) if n == actual =>
        println("Nailed it")
        break
      case Success(_) => println("Try again")
      case Failure(_) => "You didn't specify a correct number, dumbass"
    }
  }

} else {
  println("Unsupported game type")
}
