package tap

object HigherOrderFunction {
  def isEven(x: Int) = x % 2 == 0
  def isOdd(x: Int) = x % 2 != 0
  def square(x: Int) = x * x
  def cube(x: Int) = x * x * x
  def isPrime(x: Int) = {
    if(x == 1) false
      else if(x==2) true
        else !(2 to x/2).exists(valor => x %valor == 0)
  }
  def  hof( f :Int => Boolean, m : Int => Int, xs :List[Int] ): List[Int] =  {
    xs.filter(f).map(m)
  }
}
