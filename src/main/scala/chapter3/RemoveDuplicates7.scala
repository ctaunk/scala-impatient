package chapter3

object RemoveDuplicates7 extends App {
  val a = Array(1, 1, 2, 2, 3, 3, 4)
  println(a.distinct.mkString(","))
}