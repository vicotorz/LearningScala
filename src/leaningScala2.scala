/**
  * Created by dell on 2018/10/16.
  * 第二章 处理数据：字面量、值、变量和类型
  */
object leaningScala2 {
  def main(args: Array[String]): Unit = {

    val world = "world"
    println("hey",s"hello $world")//$外部引用

    s"nihao,$world"

    val str:Int = 123
    println(str.toDouble)//toType类型转换

    //正则表达式
    println("Froggy went a courting" matches ".* courting")
    println("milk,tea,muck" replaceAll("m[^ ]+k","coffee"))
    println("milk,tea,muck" replaceFirst("m[^ ]+k","coffee"))


    //模式匹配
    val input ="Enjoying this apple 3.141596 times today"
    val pattern = """.* apple ([\d.]+) times.*""".r
    val pattern(result)=input
    //   模式 （输出的结果） = 输入
    val res=result.toDouble
    println(res)

    //元组操作
    val info = (5,"zhang",true)//创建1
    val red = "red"->"like"//创建2

    //访问元组：
    val name = info._2
    val reversed =red._2->red._1
    println(name)
    println(reversed)
  }
}
