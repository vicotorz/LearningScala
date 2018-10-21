/**
  * Created by dell on 2018/10/21.
  * 第6章  常用集合
  */
object learningScala6 {

  def main(args: Array[String]): Unit = {
    val colors = List("red", "green", "blue")
    println(colors.head)
    println(colors.tail)
    println(colors(1))
    println(colors(2))
    colors.foreach((c: String) => println(c))

    val sizes = colors.map((c: String) => c.size)
    println(sizes)


    val numbers = 1 :: 2 :: 3 :: 4 :: Nil

    val first = Nil.::(1)
    //插第一个元素
    val second = 2 :: first //追加效果，在第一个元素前添加一个元素2
    println(numbers)
    println(first)
    println(second)

    val f = List(23, 8, 14, 21) filter (_ > 18)
    val p = List(1, 2, 3, 4, 5) partition (_ < 3)
    val s = List("apple", "to") sortBy (_.size)

    println(f)
    println(p)
    println(s)


    List(0, 1, 0) collect { case 1 => "ok" } //偏函数
    List("milk,tea") flatMap (_.split(',')) //使用一个给定的函数转换各个元素
    List("milk", "tea") map (_.toUpperCase) //转换各个元素

    println(List(41, 59, 26).max)
    println(List(41, 59, 26).min)
    println(List(1, 2, 3).product)
    println(List(1, 4, 5).sum)

    val validations = List(true,false,true)
    validations forall (_ == true)

    //set
    val unique = Set(10,20,30,20,20,10)
    val sum = unique.reduce((a:Int,b:Int) => a+b)
    println(sum)

    //map
    val colorMap = Map("red" ->123,"green"->456)
    val hashWhite = colorMap.contains("white")
    for(pairs <- colorMap){println(pairs)}

  }

}
