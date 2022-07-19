package Dataflair

object higerorder {
    def main(args: Array[String]) = {
      functionExample(25, multiplyBy2)                   // Passing a function as parameter
    }
    def functionExample(a:Int, f:Int=>AnyVal):Unit = {
      println(f(a))                                   // Calling that function
    }
    def multiplyBy2(a:Int):Int = {
      a*2
    }
}
object MainObject {
  def main(args: Array[String]) = {
    var result = multiplyBy2(add2(10))      // Function composition
    println(result)
  }
  def add2(a:Int):Int = {
    a+2
  }

  def multiplyBy2(a:Int):Int = {
    a*2
  }
}
