object Demo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(56); 
  println("Welcome to the Scala workshee")}
  //scala supports concurrency and distribution so variables should be declared as val(constants)

case class Student(name:String = "varun", var rollno: Int)
{
  def show() = {
   println("Hi how are you")
   }
   
   def >(s:Student): Boolean = { rollno > s.rollno
    
}
var s = new Student(rollno = 123)
s.rollno
s.show()

var s1 = new Student(rollno = 113)

println( s.>(s1))

var nums = List(1,2,3,4,5)

for(nu <- nums){
println(nu)
}



}
}
