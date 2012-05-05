/**
 * Created by alhry, 20:47 5/05/12
 */

object p001 {
  val nats = Stream.from(0)
  val answer = nats filter (x => (x % 3 == 0) || (x % 5 == 0) )
  def main(args:Array[String]) { println(answer.takeWhile(x=>(x < 1000)).sum) }
}
