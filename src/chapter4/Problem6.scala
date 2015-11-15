package chapter4

object Problem6 extends App {
  val daysOfTheWeek = scala.collection.mutable.LinkedHashMap[String, Int]()
  daysOfTheWeek("Monday") = java.util.Calendar.MONDAY
  daysOfTheWeek("Tuesday") = java.util.Calendar.TUESDAY
  daysOfTheWeek("Wednesday") = java.util.Calendar.WEDNESDAY
  daysOfTheWeek("Thursday") = java.util.Calendar.THURSDAY
  daysOfTheWeek("Friday") = java.util.Calendar.FRIDAY
  daysOfTheWeek("Saturday") = java.util.Calendar.SATURDAY
  daysOfTheWeek("Sunday") = java.util.Calendar.SUNDAY
  for((k,v) <- daysOfTheWeek) println(k + " -> " + v)
}