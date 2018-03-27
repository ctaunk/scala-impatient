package chapter3

object Swap2 {
  
  def swap(a: Array[Int]): Array[Int] = {
    for (i <- 1 until (a.length, 2)) {
      val temp = a(i - 1)
      a(i - 1) = a(i)
      a(i) = temp
    }
    a
  }
  
  def main(args: Array[String]): Unit = {
    var a = Array(1,2,3,4,5)
    a = swap(a)
    println(a.mkString(","))
  }
  
}