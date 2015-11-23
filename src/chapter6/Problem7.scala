package chapter6

object Suite2 extends Enumeration {

  val Spade = Value("\u2660")
  val Heart = Value("\u2665")
  val Club = Value("\u2663")
  val Diamond = Value("\u25C6")

  def isRed(suite: Suite2.Value) = suite == Heart || suite == Diamond
}

object TestCardSuite2 extends App {
  for (s <- Suite2.values) println(s.id + " : " + s.toString + " " + Suite2.isRed(s))
}
