// Basic pants-scala project 2019 @LiuVII

package basics.plugins

import cats.effect.IO

object BasicBetterMonadicForExample {
  // For more info about plugin see: https://github.com/oleg-py/better-monadic-for
  def checkNoWithFilter: IO[Int] = {
    def getCounts: IO[(Int, Int)] = ???

    for {
      (x, y) <- getCounts
    } yield x + y
  }


  def checkLHSTypeAscriptions: IO[String] = {
    def getThing: IO[String] = ???

    for {
      x: String <- getThing
    } yield s"Count was $x"
  }
}
