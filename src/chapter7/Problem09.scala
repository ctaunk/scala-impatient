package chapter7

object Problem09 extends App {

  val password = Console.in.readLine()
  if ("secret".equals(password))
    println("Hello " + System.getProperty("user.name"))
  else
    println("Hello World!")
}
