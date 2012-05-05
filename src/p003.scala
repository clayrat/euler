/**
 * Created by alhry, 23:03 5/05/12
 */

object p003 {
  var theNum = 600851475143L;
  val nats = Stream.from(2)
  val answer = nats.dropWhile(n => {while(theNum % n == 0) {theNum /= n}; theNum > 1})
  def main(args:Array[String]) { println(answer.head)}
}
