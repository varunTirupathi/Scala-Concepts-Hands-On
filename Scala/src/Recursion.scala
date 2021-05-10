import scala.annotation.tailrec


object Recursion extends App {
  
  def factorial(n: Int):Int =
    if(n <= 1)1
    else {
      println("computing factorial of " + n + " "+ "I first need to compute factorial of " + (n-1))
    val result = n * factorial(n-1) // 10 * 9 * 8
    
    result
    }
  //factorial(100000)
  
  // factorial in a recursive way
  
  def recursiveFactorial(num: BigInt): BigInt = {     
    @tailrec
    def factHelper(x:BigInt,acc:BigInt):BigInt = 
      if(x <=1) acc
      else factHelper(x - 1, x * acc)  //TAIL RECURSION == use recursive call as the last expression
    factHelper(num, 1)
    
  }
 // println(recursiveFactorial(5000))
  
  // WHEN YOU NEED LOOPS, USE_TAIL_RECURSION.
  
  
  /*
    1.concatenatre a string n times
    2. Isprime function
    3. Fibonacci function 
  */
  
  def concatenate(input: String,ntimes:Int,acc: String): String = {
      if(ntimes <= 0) acc
      else concatenate(input, ntimes-1,input+acc)
     
  }
  println(concatenate("varun",12,""))
  
  
//  def Isprime(num:Int):Boolean = {
//    def helper(t:Int, acc: Int):Boolean = {
//      if(t <= 1) true
//      else num % t != 0 acc
//        
//    }
    
//}
  
  def isPrime(num: Int):Boolean = {  
    def isPrimeTailrec(t:Int,isStillPrime:Boolean):Boolean = 
      if (!isStillPrime) false
      else if(t <=1) true
      else isPrimeTailrec(t-1, num % t !=0 && isStillPrime)
      
      isPrimeTailrec(num/2, true)
    
  }
  
  def fibonacci (n:Int):Int = {
    def helper(i:Int,last:Int,nextLast: Int):Int = 
      if(i >= n) last
      else 
        helper(i + 1, last + nextLast, last)    
      if(n <=2) 1
      else
        helper(3,1,1)
    
  }
  println(fibonacci(8))
}