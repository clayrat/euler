/**
 * Created by alhry, 21:22 7/05/12
 */

object p007 {
 lazy val primes: Stream[Int] = 2 #:: (Stream.from(3) filter (x=> primes.takeWhile(i => i*i<=x).forall(x%_>0)))
  def main(args:Array[String]) { println(primes(10000)) }
}
