

object MethodNotations extends App {

  class Person(val name: String, favouritemovie: String,val age: Int = 0){
    def likes(movie: String): Boolean = 
      movie.equalsIgnoreCase(favouritemovie)
  
    def +(person: Person): String = s"${this.name} hang outs with ${person.name}"
  
    def unary_! : String = s"$name, hello"
    
    def isAlive: Boolean = true
    
    def apply(): String = s"hi my name is ${this.name} my favouroitte moview is $favouritemovie"
    
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favouritemovie,27)
    
    def unary_+ : Person = new Person(name, favouritemovie, age + 1)
    
    def learns(mess: String): String = s"Marn learns $mess"
    
    def learnsScala = learns("scala")
    
    def apply(num:Int): String = s"$name watched $favouritemovie $num times" 
    
  }
    val mary = new Person("Mary","Inception")
    println(mary.likes("Inception"))
    println(mary likes "inception") // equivalent natural language
    // infix notation = operator notation (syntactic sugar)
    
    // operators in scala
//    
    val hary = new Person("Hary","mag",25)
    println(hary likes "mag")
    println(hary + mary)
      
    
    // ALL OPERATORS ARE METHODS
    
    // AKKA actors have ! ?
    
    // prefix notation
       val x = -1 // equivalent with 1.unary_-
       val y = 1.unary_-
       
       println(!mary)
       println(mary.unary_!)
       //postfix notation
       println(mary isAlive)
       println(mary.isAlive)
       println(mary.learnsScala)
       
         // apply method
       
        println(mary.apply()) 
        println(mary()) // equivalent
        
        println(mary(100))
        
        println((mary + "the rockstar").apply())
        println((+mary).age)
               
        
        
        
        
        
    
    
    
    
        
       
       
     
       
}