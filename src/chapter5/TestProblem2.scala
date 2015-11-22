package chapter5

object TestProblem2 extends App {
  val account = new BankAccount
  println(account.balance)
  account.deposit(100)
  println(account.balance)
  account.withdraw(75)
  println(account.balance)
  try {
    account.withdraw(50)
  } catch {
    case t: Throwable => t.printStackTrace() // TODO: handle error
  }
  println(account.balance)
}