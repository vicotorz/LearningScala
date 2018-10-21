/**
  * Created by dell on 2018/10/21.
  * 第5章  首类函数
  */
object learningScala5 {

  //用通配符为函数赋值
  def max(a:Int,b:Int) = if (a>b) a else b
  val maximize:(Int,Int) => Int = max

  //编写函数字面量
  def safeStringOp(s:String, f:String => String) ={
    if(s!=null) f(s) else s
  }

  //柯里化
  def factorOf(x:Int)(y:Int) = y%x ==0
  val isEven = factorOf(2)_

  def main(args: Array[String]): Unit = {
    println(maximize(50,30))

    println(safeStringOp("hello",(s:String) => s.reverse))

    val z = isEven(32)
    println(z)
  }

}
