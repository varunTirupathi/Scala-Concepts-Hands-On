object Exceptions extends App{
  
  val x: String = null
  //println(x.length())
  //this will crash
  
  // 1. throwing exceptions
  
  //val aWierdValue: String = throw new NullPointerException
  
  //throwable classes extends the Throwable class.
  // Exception and Error are major throwable subtypes

  // 2. how to catch exceptions
  
  def getInt(withExceptions: Boolean): Int =
    if(withExceptions) throw new RuntimeException("no int for you") 
    else 42
   val potentialFail =  try {
      getInt(true)
    } catch {
      case e: RuntimeException => println("caught run time exception")
    }finally {
      println("always executed")
    }
    println(potentialFail)

//    class MyException extends Exception
//    val exception = new MyException
//    throw exception 

   // exercise
   //val array = Array.ofDim(Int.MaxValue)
   
   //def infinite: Int = 1 + infinite
   class OverFlowException extends RuntimeException
   class Underflowexception extends RuntimeException
   class mathcalculatinexception extends RuntimeException("division by zero")
   object pocketcalculator {
      def add(x:Int,y:Int) = {
        val result = x + y
        if(x>0 && y>0 && result < 0)
          throw new OverFlowException
        else if(x <0 && y<0 &&  result > 0)
          throw new Underflowexception
        else result
      }
      def subtract(x:Int, y:Int) = {
        val result = x -y
        if(x > 0 && y < 0 && result < 0) throw new OverFlowException
        else if(x < 0 && y > 0 && result > 0) throw new Underflowexception
        else result
      }
      def multiply(x: Int, y:Int) = {
        val result = x+y
        if(x>0 && y>0 && result < 0 ) throw new OverFlowException
        else if(x< 0 && y<0 && result < 0 ) throw new Underflowexception
        else if(x>0 && y < 0 && result > 0) throw new Underflowexception 
        else if(x< 0 && y<0 && result > 0 ) throw new Underflowexception
        else result
      }
      def divide(x:Int,y:Int) = {
        if(y == 0) throw new mathcalculatinexception
        else x / y
      }
    }
    println(pocketcalculator.add(10, 20))
    println(pocketcalculator.divide(10,2))
}



