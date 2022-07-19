class dataflairpractice (str: String) {
  def length = str.length

  def perform(fun: Int => Int) = {
    println(fun(length))
  }

  def perform1(fun1: Int => Boolean) = {
    println(fun1(length))
  }
}
object dataflairobj extends App {
  val incrementbyone = (x: Int)=> x+1
  val stralike = new dataflairpractice("Druva kumar")
  stralike.perform(incrementbyone)
  stralike.perform((x: Int)=>x*x)
  stralike.perform1((x: Int)=>x>5)
  //
  def sum1(func: Int=>Int,a: Int,b: Int): Int= if (a>b) 0 else func(b) + sum1(func, a+1,b)
  def sumofint(a: Int,b: Int) = sum1(number,a,b)
  def number(c:Int) = c
  println(sumofint(2,4))
}
