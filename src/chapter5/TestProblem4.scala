package chapter5

object TestProblem4 extends App {
  val time1 = new Time2(11, 59)
  val time2 = new Time2(minutes = 58, hours = 11)
  println(time1.before(time2))
  println(time2.before(time1))
}