/**
  * Created by dell on 2018/10/21.
  * 第9章  对象、Case类和Trait
  */
class learningScala8 {

  class A{def hi="hi"}
  trait B{ self:A => override def toString = "B:"+ hi}//增强方法
  class C extends A with B


  def main(args: Array[String]): Unit = {
      println(new C())
  }
}
