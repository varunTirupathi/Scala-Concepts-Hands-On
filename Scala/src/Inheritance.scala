object InheritanceAndTraits extends App {
  
  class Animal {
   def eat = println("nomnom") 
   var creatureType = "insect"
  }
  class Cat extends Animal {
     val cat = new Cat
  cat.eat
  } 

class person(name:String,age:Int)
class Adult(name:String,age: Int,idcard: String) extends person(name,age)

class Dog(dogType: String) extends Animal {
  override def eat = println("crunch","crunch")
}

val dog = new Dog("vc")
dog.eat
//println(dog.creatureType)
println(dog.creatureType)

//type substitutuion // polymorphism
val unKnownAnimal:Animal = new Dog("fsc")
 println(unKnownAnimal.eat)

 //super



}

   