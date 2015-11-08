package chapter3

object Partition4 {
  
  def partition(a: Array[Int]): Array[Int] = {
    val positiveOnly = a.filter(_ > 0)
    val remaining = a.filter(_ <= 0)
    positiveOnly ++ remaining
  }
  
  def main(args: Array[String]): Unit = {
    val a = Array(1, 2, -1, -2, -3, 4, 6, -7)
    println(partition(a).mkString(","))
  }
  
}