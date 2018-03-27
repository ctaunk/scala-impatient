package chapter3

object Average5 {

  def average(a: Array[Double]): Double = {
    a.sum / a.length
  }

  def main(args: Array[String]): Unit = {
    val a = Array(2.5, 4.6, 10.2, 1.12)
    println(average(a))
  }
}