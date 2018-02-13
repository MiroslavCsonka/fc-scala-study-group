import scala.io.StdIn._
import scala.util.{Failure, Success, Try}
import scala.util.control.Breaks._

def generateValue = (Math.random() * 10).round

def readNumber: Try[Int] = Try(readLine().toInt)

println("Guess a number: ")

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

