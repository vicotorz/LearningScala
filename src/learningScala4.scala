/**
  * Created by dell on 2018/10/21.
  * 第4章  函数
  */
object learningScala4 {
  def multiplier(x:Int,y:Int):Int = { x*y }

  def hi():String ="hi"

  //表达式块
  def formatEuro(amt:Double) = f"$amt%.2f"//调用函数

  //尾递归优化
  @annotation.tailrec
  def power(x:Int,n:Int,t:Int =1):Int = {
    if(n<1) t
    else power(x,n-1,x*t)
  }

  //嵌套函数
  def max(a:Int, b:Int, c:Int) = {
    def max(x:Int,y:Int) = if(x>y) x else y //嵌套函数
    max(a,max(b,c)) //max(42,181,19) --> 181
  }

  //参数
  def greet(name:String, prefix:String = "")=s"$prefix$name"

  //多参数
  def sum(items:Int*):Int = {
    var total = 0
    for(i<-items) total+=i
    total
  }

  //多参数
  def max(x:Int)(y:Int) = if (x>y) x else y

  //类型参数
  def identity[A](a:A):A = a


  def main(args: Array[String]): Unit = {
    println(formatEuro(3.4645))
    println(power(2,8))
    println(max(1,23,4))
    println(greet(name="zhangdi",prefix = "12"))
    println(sum(1,2,3,4,5))

    val larger=max(20)(39)
    println(larger)

    val s:String = identity[String]("Hello")
    val d:Double = identity[Double](2.717)
    println(s)
    println(d)

  }
}
