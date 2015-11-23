package chapter6

class Origin extends java.awt.Point

object TestOrigin extends App {
  val origin = new Origin()
  origin.setLocation(2.2, 1.4)
  println(origin)
}
