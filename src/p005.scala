/**
 * Created by alhry, 22:33 5/05/12
 */

object p005 {
  val answer = (1 to Int.MaxValue).find(n => (1 to 20).forall(n % _ == 0)).get
  def main(args:Array[String]) { println(answer) }
}
