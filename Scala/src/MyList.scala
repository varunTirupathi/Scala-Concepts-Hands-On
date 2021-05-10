abstract class MyList[+A] {

  def head: A
  def tail: MyList[A]
  def isEmpty: Boolean
  def add[B >: A](Element: B): MyList[B]
  def printElements: String
  //polymorphic call
  override def toString: String = "[" + printElements + "]"

  def map[B](transformer:A => B) : MyList[B]
  def flatMap[B](transformer: A => MyList[B]): MyList[B]
  def filter(predicate: A => Boolean ): MyList[A]
  //concatenation
  def ++[B >: A](list: MyList[B]): MyList[B]
}

 object Empty extends MyList[Nothing] {

  def head: Nothing = throw new NoSuchElementException
  def tail: MyList[Nothing] = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add[B >: Nothing](Element: B): MyList[B] = new cons(Element, Empty)
  def printElements: String = ""
  
  // higher order functions
  def map[B](transformer: Nothing => B) : MyList[B] = Empty
  def flatMap[B](transformer:Nothing => MyList[B]): MyList[B] = Empty
  def filter(predicate: Nothing => Boolean): MyList[Nothing] = Empty
  
   def ++[B >: Nothing](list: MyList[B]): MyList[B] = list

}

 class cons[+A](h: A, t: MyList[A]) extends MyList[A] {

  def head: A = h
  def tail: MyList[A] = t
  def isEmpty: Boolean = false
  def add[B >: A](Element: B): MyList[B] = new cons(Element, this)
  def printElements: String =
    if (t.isEmpty) " " + h
    else h + " " + t.printElements

    
    /*
        [1,2,3].filter(n%2 == 0) =
           [2,3].filter(n%2 == 0) =
           = new cons(2,[3].filter(n%2 == 0)) 
           =new cons(2, Empty.filter(n%2 == 0))
           = new cons(2,Empty)
    
*/    
  def filter(predicate: A => Boolean ): MyList[A] =
    if (predicate(h)) new cons(h, t.filter(predicate))
    else t.filter(predicate)

    /*
         [1,2,3].map(n*2)
           = new cons(2,[2,3].map(n*2))
           = new cons(2,new cons(4,[3].map(n*2)))
           = new cons(2,new cons(4,new cons(6,Empty.map(n*2))))
           = new cons(2,new cons(4,new cons(6),Empty)) 
  * */  
    
  def map[B](transformer: A => B): MyList[B] =
    new cons(transformer(h), t.map(transformer))

/*
 *  [1,2] ++ [3,4,5]
 *  = new cons(1, [2] ++ [3,4,5])
 *  = new cons(1,new cons(2,Empty ++ [3,4,5]))
 *  = new cons(1, new cons(2,new cons(3,new cons(4),new cons(5)))))
*/ 
  def ++[B >: A](list: MyList[B]): MyList[B] = new cons(h, t ++ list)
  
  
  /*
    [1,2].flatmap(n => [n,n+1])
    =[1,2] ++ [2].flatmap (n => [n,n+1])
    =[1,2] ++ [2,3] ++ Empty.flatmap(n => [n,n+1])
    =[1,2] ++ [2,3] ++ Empty
    =[1,2,2,3]
*/ 
  def flatMap[B](transformer: A => MyList[B]): MyList[B] = 
    transformer(h) ++ t.flatMap(transformer)
  
  

}

//trait myPredicate[-T] { // T => Boolean
//    def test(elem: T): Boolean
//}
//
//trait myTransformer[-A,B] { // A => B
//  def transform(elem: A): B
//}


 object ListTest extends App {
//  val list = new cons(1, new cons(2, Empty))
//  println(list.head)
//  println(list.tail.head)
//  println(list.add(4).head)
//  println(list.isEmpty)
//  println(list.toString())
val listofintegers: MyList[Int] = new cons(1,new cons(2,new cons(3,new cons(4,Empty))))
val clonelistofintegers: MyList[Int] = new cons(1,new cons(2,new cons(3,new cons(4,Empty))))
val anotherlistofintegers: MyList[Int] = new cons(1,new cons(2,new cons(3,new cons(4,Empty))))
val listofstrings: MyList[String] = new cons("hello", Empty)

println(listofintegers.toString())
println(listofstrings.toString())

//println(listofintegers.map(new Function1[Int,Int] 
//{
//  override def apply(elem: Int): Int = elem * 2 }
//))
//
//println(listofintegers.filter(new Function1[Int, Boolean]
//{
//  override def apply(elem: Int): Boolean = elem % 2 == 0 }
//))
//
//println((listofintegers ++ anotherlistofintegers))
//
//println(listofintegers.flatMap(new Function1[Int, MyList[Int]]{
// override def apply(elem:Int): MyList[Int] = new cons(elem, new cons(elem + 1, Empty))  
//}))
//
//println(clonelistofintegers == listofintegers)

println(listofintegers.map(elem => elem * 2).toString())

println(listofintegers.filter(elem => elem % 2 == 0).toString())

println(listofintegers.flatMap(elem => new cons(elem, new cons(elem + 1, Empty))).toString())

val superadd = (x: Int) => (y: Int) => x + y
println(superadd(3)(4))


}



























