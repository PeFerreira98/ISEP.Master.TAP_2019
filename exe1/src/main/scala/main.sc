
def abs(x: Int) =
  if(x >= 0) x else -x

def square (x: Double): Double =
  x * x

val x1=2
if (x1 > 0) 1

def lessThan(x: Double, y: Double): Boolean =
  if(x < y) true else false

val x2 = lessThan(3, 5)
val x3 = lessThan(5, 3)
val x4 = lessThan(5, 5)

def and(x: Boolean, y: Boolean) =
  if(x) y else false

def or(x: Boolean, y: Boolean) =
  if(x) x else y

assert(and(true, true)==true)
assert(and(true, false)==false)
assert(and(false, true)==false)
assert(and(false, false)==false)
assert(or(false, false)==false)
assert(or(true, true)==true)
assert(or(true, false)==true)
assert(or(false, true)==true)
println("tests passed")


def factorial(n: Long): Long =
  if(n==0) 1 else n * factorial(n-1)

def sumDown_rec(x:Int, s:Int): Int =
  if(x==0) s else sumDown_rec(x-1, s+x)

def sumDown(x:Int): Int =
  sumDown_rec(x, 0)

assert(sumDown(5)== 15)
println("tests passed")


def nSymbol_rec(x:Int, y:Char, z:String):String =
  if(x !=0) nSymbol_rec(x-1, y, z+y) else z

def nSymbol(x:Int, y:Char):String =
  nSymbol_rec(x, y, "")

assert(nSymbol(5,'*') == "*****")
println("tests passed")


def mult(x:Int, y:Char):Int =
  if(x == 0) mult(x-1, y) else

assert(mult(4,3) == 12)
assert(mult(0,0) == 0)
assert(mult(0,1) == 0)
assert(mult(1,0) == 0)
assert(mult(-3,-3) == 9)
assert(mult(-3,4) == -12)
assert(mult(3, -4) == -12)
println("tests passed")

