

object AnonymousClases extends App {
  
  abstract class Animal {
    def eat: Unit
  }
  //anonymous class
  val funnyAnimal : Animal = new Animal {
    override def eat: Unit = println("cxhzjk")
  }
  println(funnyAnimal.getClass)
  
  class Person(name: String){
    def SayHi: Unit = println("hello n")
  }
  
}