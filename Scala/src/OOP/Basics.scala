package OOP

object Basics extends App {
  
  val person = new Person("varun",12)
  
  println(person.greet("kumar"))
  person.greet()
  
  var author = new Writer("varun","Tirupathi",1994)
  println(author.fullname)
  var novel = new Novel("6AM",1994, author)
  println(novel.authorage)

  var imposter = new Writer("sharnav","Shannu",2019)
  
    println(novel.isWrittenBy(author))
    
   val counter = new Counter()
  counter.inc(10).print
   counter.dec.print
   counter.inc.inc.inc.print
     
}
class Person(val name: String, val age:Int){ //constructor 
  val x = 20
  
  //method
def greet(name:String): Unit = println(s" ${this.name} says hi to $name ")

//overloading
def greet(): Unit = println(s"Hi, I am $name")

//multiple constructors
def this(name:String) = this(name,0)
}

// Class parameters are not fields

/*
Novel and writer
writer: first name
*/

class Writer(firstname: String, surname: String,val year: Int) {
  
  def fullname: String = {
    firstname + surname
  }
}

class Novel(name: String, YOR: Int, author: Writer) {
  def authorage = YOR - author.year
  
  def isWrittenBy(author : Writer) = {
    author == this.author
       
  }
  def copy(yor: Int)={
    var novel = new Novel(name, YOR, author)
  }
}
  
 class Counter(val count: Int = 0) {
   def inc = new Counter(count + 1)
   
   def dec = new Counter(count - 1)
   
   def inc(n:Int):Counter = {
        if(n <= 0) this
        else inc.inc(n-1)
   }
   
   def print = println(count)
   
 }
  
  
  



