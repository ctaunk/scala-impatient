package chapter2

object Power {
  def calc(x: Double, n: Int): Double = {
    if (n == 0) 1
    else if (n < 0)
      1/calc(x, -1*n)
    else if (n % 2 == 0) {
      val y = calc(x, n/2)
      y * y
    } else {
      val y = calc(x, n-1)
      x * y
    }
  }
  
  def main(args: Array[String]): Unit = {
    println(calc(2,-5))
  }
}