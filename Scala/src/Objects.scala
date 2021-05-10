

object Objects extends App{

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
  
  object Person {
    
    //"static"/"class" level functionality
    val N_EYES = 2
    def canFly: Boolean = false
    
    // factory-method
    def apply(mother: Person, father:Person): Person = new Person("Bobbie")
  }
  
  class Person(val name: String) {
    // seperate instance level functionality
  }
  
 //companions
  
  
  val mary = new Person("mary")
  val john = new Person("john")
  
  println(mary == john)
  
  
  val bobby = Person(mary,john)
  
  // scala applications = scala object with
  // def main(args: Array[String]): Unit
  
  
}