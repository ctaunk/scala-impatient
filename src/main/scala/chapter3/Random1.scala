package chapter3

import util.Random

object Random1 {
  
  def random(n: Int): Array[Int] = {
    val a = new Array[Int](n)
    for (i <- 0 until a.length) a(i) = Random.nextInt(n)
    a
  }
  
  def main(args: Array[String]): Unit = {
    val a = random(9)
    println(a.mkString(","))
  }
  
}