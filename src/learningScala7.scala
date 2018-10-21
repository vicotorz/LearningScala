/**
  * Created by dell on 2018/10/21.
  * 第8章  类
  */
object learningScala7 {

  //抽象类
  abstract class Car{
    val year:Int
    val automatic:Boolean = true
    def color:String
  }

  class RedMini(val year:Int) extends Car{
    def color="Red"
  }

  val m:Car = new RedMini(2005)


  def main(args: Array[String]): Unit = {
    class User
    val u = new User
    val isAnyRef = u.isInstanceOf[AnyRef]
    println(isAnyRef)


    class Singular[A](element:A) extends Traversable[A]{
      def foreach[B](f:A=>B) = f(element)
    }

    println(m)

    val p = new Singular("Planes")
    println(p)
  }

}
