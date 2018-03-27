package chapter6

object Suite extends Enumeration {

  val Spade = Value("\u2660")
  val Heart = Value("\u2665")
  val Club = Value("\u2663")
  val Diamond = Value("\u25C6")

}

object TestCardSuite extends App {
  for (s <- Suite.values) println(s.id + " : " + s.toString)
}
