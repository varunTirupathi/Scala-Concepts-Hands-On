

object Defaultargs extends App {
  
  def factorial(a:Int,acc:Int = 1):Int = {
    if(a <=1 )acc
    else
      factorial(a-1, a*acc)
  }
  factorial(10)
}