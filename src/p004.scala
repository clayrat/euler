/**
 * Created by alhry, 21:04 7/05/12
 */

object p004 {
  val a = (100 to 999) flatMap (x => (x to 999).map(y=>y*x)) filter (x => x.toString.reverse==x.toString )
  def main(args:Array[String]) { println(a.max)}
}
