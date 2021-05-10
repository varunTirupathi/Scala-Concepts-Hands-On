

object Functions extends App {
  
  def aFunction(a : String, b:Int): String = {
    a + " " + b // expression in block
  }
  
  println(aFunction("varun", 2))
  
  def AparameterlessFunction():Int = 42
  
  println(AparameterlessFunction())
  
  def aRepeatedFunction(a:String,b: Int): String = {
    if(b == 1) a else
      a + aRepeatedFunction(a, b-1) // recursive function // always specify return types for recursive functions
  }
  
  println(aRepeatedFunction("Hello", 3))
    
 // WHEN WE NEED LOOPS USE RECURSIVE FUNCTIONS.
  
  def aFunctionWithSideEffects(a: String): Unit = {
    println("hello there") // sideeffect
  }
  
  def aBigFunction(n:Int): Int  = {
    def aSmallerFunction(a:Int, b:Int): Int = a + b
    aSmallerFunction(n, n-1)
  }
  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}