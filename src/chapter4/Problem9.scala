package chapter4

object Problem9 extends App {

  def lteqgt(values: Array[Int], v: Int) = {
    (values.count(_ < v), values.count(_ == v), values.count(_ > v))
  }

  val values = Array(2, 3, 5, 7, 8, 6, 3, 2)
  println(lteqgt(values, 5))
}
