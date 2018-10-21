/**
  * Created by dell on 2018/10/21.
  * 第10章  高级类型
  */
object learningScala9 {

  //隐含类
  object ImplicitClasses{
    implicit class Hello(s:String){ def hello = s"Hello,$s"}//隐含类

    def test = {
      println("world".hello)
    }
  }

  //隐含值,隐含参数
  object ImplicitParams{
    def greet(name:String)(implicit greeting:String) = s"$greeting, $name"
    implicit val hi="Hello"

    def test = {
      println(greet("Developers"))
    }
  }

  def main(args: Array[String]): Unit = {
    //高层元组和函数字面量
    val t1:(Int,Char) = (1,'a')
    val t2:(Int,Char) = Tuple2[Int,Char](1,'a')
    val f1:Int => Int = _+2
    val f2:Int => Int = new Function1[Int,Int]{def apply(x:Int) = x*2 }
    println(f1)
    println(f2)
  }
}
