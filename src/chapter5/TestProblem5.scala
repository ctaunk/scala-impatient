package chapter5

object TestProblem5 extends App {
  val student = new Student("name", 1)
  println(student.getId())
  println(student.getName())
  student.id = 2
  println(student.id)
  student.name = "new name"
  println(student.name)
}