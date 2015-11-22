package chapter5

class BankAccount {
  
  private var accountBalance = 0;
  
  def deposit(amount: Int) = accountBalance += amount
  
  def withdraw(amount: Int) = {
    if (accountBalance - amount < 0) {
      throw new IllegalArgumentException("Insufficient balance for withdrawal")
    }
    accountBalance -= amount
  }
  
  def balance = accountBalance
  
}