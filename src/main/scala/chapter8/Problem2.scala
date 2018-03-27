package chapter8

class SavingsAccount(initialBalance: Double, interestRate: Double, charge: Double = 1, freeTransactions: Int = 3) extends BankAccount(initialBalance) {
  private var transactionCount = 0

  override def deposit(amount: Double): Double = {
    transactionCount += 1
    if (transactionCount <= freeTransactions) {
      super.deposit(amount)
    } else {
      super.deposit(amount - charge)
    }
  }
  override def withdraw(amount: Double): Double = {
    transactionCount += 1
    if (transactionCount <= freeTransactions) {
      super.withdraw(amount)
    } else {
      super.withdraw(amount + charge)
    }
  }

  def earnMonthlyInterest() = {
    transactionCount = 0
    val monthlyInterest = (currentBalance * interestRate) / 100
    super.deposit(monthlyInterest)
  }
}

object Problem2 {
  def main (args: Array[String]) {
    val account = new SavingsAccount(100, 5)
    println(account.deposit(50))
    println(account.deposit(50))
    println(account.withdraw(50))
    println(account.withdraw(50))
    println(account.earnMonthlyInterest())
    println(account.deposit(50))
  }
}
