package FunctionalProgramming

object Whatsafunction extends App {
  
  // use functuions as first classs elememgs
   
    var doubler = new Function1[Int,Int]{
      override def apply(value :Int): Int = value * 2
    }
    
    var StringtoIntconverter = new Function1[String,Int]{
      override def apply(mess: String):Int = mess.toInt
    }
    
    println(StringtoIntconverter("21") + 2)
    
    var adder:Function2[Int,Int,Int] = new Function2[Int,Int,Int]{
    override def apply(one:Int, two:Int):Int = one + two
    }
    
    println(adder(21,2))
    
    // In SCALA ALL FUNCTIONS ARE OBJECTS
    
    //excersie
    var Stringconcatenator = new Function2[ String,  String,  String] {
      override def apply(s1: String, s2: String): String = s1 +" "+ s2
    }
    println(Stringconcatenator("hello","world"))
    
    
    var superadder:Function1[Int, Function1[Int,Int]] = new Function1[Int,Function1[Int,Int]] {
      override def apply(x:Int): Function1[Int,Int] = new Function1[Int,Int] {
        override def apply(y:Int):Int = x + y
      }
    }
    val adder3 = superadder(3)
    println(adder3(4))
    println(superadder(3)(4)) // curried function
}