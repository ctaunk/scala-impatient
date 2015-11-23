package chapter6

class Point(val x: Int, val y: Int) {

  override def toString: String = {
    "Point(" + x + ", " + y + ")"
  }
}

object Point {
  def apply(x: Int, y: Int): Point = {
    new Point(x, y)
  }
}

object TestPoint extends App {
  val point = Point(4, 3)
  println(point)
}