package application

object PandigitalPrime extends App with PandigitalPrimeDefinitions {
  for (v <- numbersSequence) {
    if (isPrime(v)) {
      println(v + " is prime and " + v.toString().length + "-pandigital")
    } else {
      println(v)
    }
  }
}

trait PandigitalPrimeDefinitions {
  def isPrime(v: Int): Boolean = v % 3 == 0 && v % 7 == 0
  lazy val numbersSequence: Range = (1 to 10001)
}
