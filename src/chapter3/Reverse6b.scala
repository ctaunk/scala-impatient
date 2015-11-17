package chapter3

import scala.collection.mutable.ArrayBuffer

object Reverse6b extends App {
  val a = ArrayBuffer(2, 8, 6, 4,  7, 2, 1)
  println(a.mkString(","))
  for (i <- 0 until a.length if i < a.length / 2) {
    val j = a.length - i - 1
    val temp = a(i)
    a(i) = a(j)
    a(j) = temp
  }
  println(a.mkString(","))
}