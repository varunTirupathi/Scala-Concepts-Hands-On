package Exercises

object one extends App {
  
  def greeting(name: String, age:Int) = {
    "Hi my name is" + name + "and I am " + age + "years old" 
  }
  
  //println(greeting("varun",12))
  
  //factorial
  
  def factorial(num: Int):Int = {
    if(num <= 0 ) 1 
    else num * factorial(num - 1)
  }
  
 
  // 1 1 2 3 5 8 13
  def fibonacci(num:Int): Int = {
    if(num <= 2) 1
    else fibonacci(num - 1) + fibonacci(num - 2)     
  }
  
  println(fibonacci(5))
  
  //prime or not
  
  def primeorNot(num: Int):Boolean = {
   def isPrimeUntil(t:Int):Boolean =
     if(t <= 1) true
     else num % t != 0 && isPrimeUntil(t-1)
     isPrimeUntil(num/2)
  }
}