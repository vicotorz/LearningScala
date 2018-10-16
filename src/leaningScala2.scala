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
  }
}
