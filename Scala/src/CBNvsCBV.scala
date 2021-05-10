

object CBNvsCBV extends App {
 def calledByValue(a:Long):Unit = {
   println("called by value" + a)
   println("called by value" + a)
 }
 
 def calledByName(a: => Long):Unit = {
   println("called by name" + a)
   println("called by name" + a)
 }
 
 calledByValue(System.nanoTime())
 calledByName(System.nanoTime())
 
 def infinite(): Int = 1 + infinite()
 def printFirst(x: Int, y: => Int) = println(x)
 
 printFirst(34, infinite())
}