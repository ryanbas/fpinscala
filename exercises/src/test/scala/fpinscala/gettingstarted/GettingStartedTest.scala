package fpinscala.gettingstarted

import fpinscala.gettingstarted.MyModule._
import fpinscala.gettingstarted.PolymorphicFunctions._
import org.scalatest.{FreeSpec, Matchers}

class GettingStartedTest extends FreeSpec with Matchers {
  /*
  Write a recursive function to get the nth Fibonacci number (http://mng.bz/C29s).
  The first two Fibonacci numbers are 0 and 1.
  The nth number is always the sum of the previous two—the sequence begins 0, 1, 1, 2, 3, 5.
   */
  "in fib function, when n is" - {
    "0 should be 0" in {
      fib(0) shouldBe 1
    }

    "1 should be 1" in {
      fib(1) shouldBe 1
    }

    "2 should be 2" in {
      fib(2) shouldBe 2
    }

    "the sum of the previous 2 should be the next" in {
      fib(10000) shouldBe (fib(9998) + fib(9999))
    }
  }

  "isSorted should be" - {
    val ascending = (a: Int, b: Int) => { a <= b }

    "true" - {
      "when array is empty" in {
        isSorted(Array(), ascending) shouldBe true
      }

      "when array is a single element" in {
        isSorted(Array(5), ascending) shouldBe true
      }

      "when using Array(1, 2, 3, 4)" in {
        isSorted(Array(1, 2, 3, 4), ascending) shouldBe true
      }
    }

    "false" - {
      "when using Array(2, 1)" in {
        isSorted(Array(2, 1), ascending) shouldBe false
      }

      "when using Array(1, 2, 4, 3)" in {
        isSorted(Array(1, 2, 4, 3), ascending) shouldBe false
      }
    }
  }
}
