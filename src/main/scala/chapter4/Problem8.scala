package chapter4

object Problem8 extends App {

  def minmax(values: Array[Int]) = {
    (values.min, values.max)
  }

  val values = Array(2, 3, 4, 1, 2, 6, 3)
  println(minmax(values))
}
