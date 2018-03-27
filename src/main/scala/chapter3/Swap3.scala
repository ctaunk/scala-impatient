package chapter3

object Swap3 {
  
  def swap(a: Array[Int]): Unit = {
    val b = for (i <- 0 until a.length) 
      yield if (i % 2 == 0)
        if (i < a.length - 1)
          a(i+1)
        else
            a(i)
      else
        a(i-1)
    println(b);
  }
  
  def main(args: Array[String]): Unit = {
    var a = Array(1,2,3,4,5)
    swap(a)
  }
}