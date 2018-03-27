package chapter3

object NoDuplicates7 {

  def main(args: Array[String]) {
    println(Array(1, 1, 2, 3, 2, 3, 4, 5, 5, 4).distinct.mkString(","))
  }

}
