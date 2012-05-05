/**
 * Created by alhry, 22:03 5/05/12
 */

object p002 {
  def fibs(a: Int, b: Int): Stream[Int] = a #:: fibs(b,a+b)
  val fibev = fibs(1,2) filter (x => (x % 2 == 0))
  def main(args:Array[String]) { println(fibev.takeWhile(x => x<4000000).sum)}
}
