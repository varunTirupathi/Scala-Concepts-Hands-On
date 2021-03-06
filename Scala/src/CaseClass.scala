

object CaseClass extends App {
  /*
   * equals, hashcode, toString
   * 
   * */
  
  case class Person(name:String, age:Int)
  
  //1. class parameters are promoted to fields
  val jim= new Person("varun",25)
  println(jim.name)
  
  println(jim.toString())
  println(jim)
  
  // 3. equals and hashcode implemented OOB
  val jim2 = new Person("Jim",34)
  println(jim == jim2)
  
  val jim3 = jim.copy(age = 45)
 println(jim3)  
  
 // 4. companion objects
 
 val theperson = Person
 val mary = Person("dana", 25)
 println(mary)
 
 // 5. serializable
 // AKKA framework
 
 // 6. CC'S have extractor patterns == ccs can be used in pattern matching
 
  case object UnitedKingdom {
    def name: String = "The Uk of GB and NI"
  }
 
}