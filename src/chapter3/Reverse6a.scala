package chapter3

object Reverse6a extends App {
  val a = Array(2, 8, 6, 4,  7, 2, 1)
  println(a.mkString(","))
  for (i <- 0 until a.length if i < a.length / 2) {
    val j = a.length - i - 1
    val temp = a(i)
    a(i) = a(j)
    a(j) = temp
  }
  println(a.mkString(","))
}