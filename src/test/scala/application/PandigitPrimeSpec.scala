package application

import org.scalatest._

class PandigitalPrimeSpec extends FlatSpec with Matchers {
  "The conditional logic object" should "have a boolean prime comparison method" in {
    PandigitalPrime.isPrime(8988) shouldEqual true 
  }
}