package chapter5

class Person2(fullName: String) {
  private[this] val parts = fullName.split(" ")
  if (parts.length < 2) {
    throw new IllegalArgumentException("Full name is not in the right format; expected format '<first> <last>'")
  }
  def firstName = parts(0)
  def lastName = parts(1)
}

object Person2 extends App {
  var person = new Person2("FirstName LastName")
  println(person.firstName)
  println(person.lastName)
}