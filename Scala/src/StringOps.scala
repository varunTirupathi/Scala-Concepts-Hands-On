

object StringOps extends App {
  
  var s: String = "hello i am learning scala"
  
  println(s.split(" ").toList)
  println(s.substring(2))
  println(s.charAt(3))
  println(s.hashCode())
  println(s.substring(2, 3))
  
  println(s.startsWith("hello"))
  println(s.replace(" ", "-"))
  println(s.toLowerCase())
  println(s.length())
  
  
  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' + aNumberString + 'z')
  println(s.reverse)
  println(s.take(2))
  
  // S-INTERPOLATOR
  
  val name = "varun"
  val age = 12
  val greeting = s"hello my name is $name and my age is $age"
  println(greeting)
  
  // F-INTERPOLATORS
  
  val speed = 1.2f
  
  val mys = f"$name can eat $speed%2.2f"
  
  // RAW INTERPOLATOR
  
  println(raw"hello thsi is \n avrun")
  
  
  
  
}