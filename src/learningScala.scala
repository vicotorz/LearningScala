import scala.concurrent.Future

/**
  * Created by dell on 2018/10/21.
  * 第7章  更多集合
  */
object learningScala {

  def main(args: Array[String]): Unit = {
    import collection.mutable.Map
    val m = Map("APPL"->597,"MSFT"->40)
    val n = m - "APPL" + ("GOOC"->521)//删除一个元素，并增加
    println(n)

    val b = Set.newBuilder[Char]
    b+='h'
    b++= List('e','l','l','o')
    val helloSet = b.result
    println(helloSet)


    val hi = "Hello," ++ "worldly" take 12 replaceAll ("w","W")
    println(hi)

    //Stream
    def inc(i:Int):Stream[Int] = Stream.cons(i,inc(i+1))//1.使用cons会生成流
    val s = inc(1)
    println(s)


    var x:String ="Indeed"
    var a = Option(x)//Some

    println(a.isDefined)

    def divide(amt:Double,divisor:Double):Option[Double] = {
      if(divisor == 0) None
      else Option(amt / divisor)//提供一种安全方法检测函数结果
    }

    println(divide(1,0))

    //Future
    import concurrent.ExecutionContext.Implicits.global
    val f = concurrent.Future {println("hi")}
    println(f)

    def nextFtr(i:Int = 0) = Future{
      def rand(x:Int) = util.Random.nextInt(x)
      Thread.sleep(rand(5000))
      if(rand(3) > 0) (i+1) else throw new Exception
    }
    println(nextFtr())


  }

}
