package chapter5

class Person1(var age: Int) {
  if (age < 0) {
    age = 0
  }
}

object Person1 extends App {
  val person = new Person1(-5)
  println(person.age)
}