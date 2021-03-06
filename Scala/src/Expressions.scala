

object Expressions extends App {
  val x = 1 + 2 // expressions
  println(x)

  println(1 == x)
  
  // == != > >= < <=
  
  println(!(1 == x))

  var aVariable = 2
  
  aVariable += 3   // -=, *= /=
  println(aVariable)
  
  // Instructions (DO) vs Expressions (VALUE)
  
  // IF expression 
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3
  var i = 1
  var whiles = while(i<10)
    i +=1
    
   println(if(aCondition) 5 else 3)
  
  var j = 0
  while(j < 10){
    j += 1
    println(j)
  }
  
  // everything in scala is an expression
  
  val aWierdvalue = (aVariable = 3)
  println(aWierdvalue)
  // side effect: which returns Unit. (println,while,reassigning)
  
  //code blocks
  
  val aCodeBlock = {
    val y =2
    val z = y + 1
    if(z> 2) "hello" else "bye"
    
  }
  
  
  val somevalue = {
    2 < 3
  }
  println(somevalue)
  
  val someothervalue = {
    if(somevalue) 123 else 234
    1244
  }
  println(someothervalue)
  
  
}

