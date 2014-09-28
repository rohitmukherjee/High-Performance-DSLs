package verification
/*
 * The McCarthy 91 function is a recursive function, defined by the computer scientist John McCarthy as a test case for formal verification within computer science.
 */
object Mcarthy91 {
 def f91(x: Integer): Int = {
   if (x > 100)
     x - 10
     else
     f91(f91(x + 11))
 }

 def main(args: Array[String]): Unit  = {
   println(f91(100))
   println(f91(50))
   println(f91(150))
 }
}