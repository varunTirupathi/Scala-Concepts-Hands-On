package FunctionalProgramming

object AnonymousFunctions extends App {
  // anonymous function (LAMBDA)
  val doubler = (x:Int) => x * 2
  
  // multiple params
  
  val adder: (Int,Int) => Int = (a, b) => a + b
  
  val justDoSomething: () => Int = () => 3
  
  println(justDoSomething)
  println(justDoSomething())
  
  //curly braces with lambda
  
  val StringtoInt = { (str: String) =>
    str.toInt
  }
  
  val niceIncrementer: Int => Int = _ + 1
  val niceadder: (Int,Int) => Int = _ + _
  
  /*
   * 
  */
}