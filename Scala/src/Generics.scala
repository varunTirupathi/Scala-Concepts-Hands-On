

object Generics extends App {
  
  class MyList[+A] {
    // use the type A(generic class) 
    
    val listofintegers = new MyList[Int]
    val listofstrings = new MyList[String]
    
    def add[B >: A](element: B): MyList[B] = ???
    /*
     * A = cat
     * B = Animal
    */
    
    
    // generic methods
    
    object MyList {
      def empty[A]: MyList[A] = ???
    }
    
    val emptyListOfIntegers = MyList.empty[Int]
    
    //variance problem
    class Animal
    class cat extends Animal
    class Dog extends Animal
    
    // yes List[cat] extends List[Animal] = covariance
    
    class covariantList[+A]{
      var animal:Animal = new cat
      var animalList: covariantList[Animal] = new covariantList[cat]
      
      // animalList.add(new Dog) ??
      
      //2.No = INVARIANCE
      
      class InvariantList[A]{
        val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]
        
      }
      
      class Trainer[-A]
      val contarvariantList: Trainer[cat] = new Trainer[Animal]
      
      //bounded types
      class cage[A <: Animal](animal: A)
      val cage = new cage(new Dog)
      
      
      
    
    }
    
        
  }
  
  
}