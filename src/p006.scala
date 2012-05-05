/**
 * Created by alhry, 22:18 5/05/12
 */

object p006 {
  val nats = Stream.from(1)
  def square(x: Int) = x*x
  def answer(n: Int) = square(nats.take(n).sum) - nats.map(square).take(n).sum
  def main(args:Array[String]) { println(answer(100)) }

}
