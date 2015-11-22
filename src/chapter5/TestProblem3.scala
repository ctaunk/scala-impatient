package chapter5

object TestProblem3 extends App {
  val time1 = new Time1(11, 59)
  val time2 = new Time1(minutes = 58, hours = 11)
  println(time1.before(time2))
  println(time2.before(time1))
}