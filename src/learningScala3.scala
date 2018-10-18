/**
  * Created by dell on 2018/10/18.
  * 第3章  表达式和条件式
  */
object learningScala3 {

  def main(args: Array[String]): Unit = {
    val amount = {
      val x = 5 * 20; x + 10
    }
    println(amount)
    //表达式嵌套
    println({
      val a = 1;
      {
        val b = a * 2;
        {
          val c = b + 4;
          c
        }
      }
    })

    //if语句
    val x=10;val y=20
    val max=if(x>y) x else y
    println(max)
  }

}
