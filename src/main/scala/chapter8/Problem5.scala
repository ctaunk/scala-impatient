package chapter8

class Point(val x: Double, val y: Double)

class LabeledPoint(val label: String, x: Double, y: Double) extends Point(x, y)

object Problem5 {
  def main(args: Array[String]) {
    val labeledPoint = new LabeledPoint("Black Thursday", 1923, 230.07)
    println(labeledPoint.label + " x = " + labeledPoint.x + " y = " + labeledPoint.y)
  }
}
