package chapter8

class CheckingAccount(initialBalance: Double, val charge: Double = 1) extends BankAccount(initialBalance) {
  override def deposit(amount: Double): Double = {
    super.deposit(amount - charge)
  }

  override def withdraw(amount: Double): Double = {
    super.withdraw(amount + charge)
  }
}

object Problem1 {
  def main (args: Array[String]) {
    val acct = new CheckingAccount(100)
    println(acct.deposit(50))
    println(acct.withdraw(50))
  }
}
