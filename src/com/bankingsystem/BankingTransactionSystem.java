package com.bankingsystem;

//1. Static Implementation
class Bank {
 private static int totalAccounts = 0;

 public Bank() {
     totalAccounts++;
 }

 public static int getTotalAccounts() {
     return totalAccounts;
 }
}

//2. Abstract Implementation
abstract class Account {
 protected double balance;

 public Account(double initialBalance) {
     this.balance = initialBalance;
 }

 public abstract void deposit(double amount);
 public abstract void withdraw(double amount);
 public abstract double getBalance();

 // Common method
 public void displayBalance() {
     System.out.println("Balance: ₹" + balance);
 }
}

class SavingsAccount extends Account {
 public SavingsAccount(double initialBalance) {
     super(initialBalance);
 }

 @Override
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited ₹" + amount + " to Savings Account");
 }

 @Override
 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println("Withdrawn ₹" + amount + " from Savings Account");
     } else {
         System.out.println("Insufficient balance in Savings Account");
     }
 }

 @Override
 public double getBalance() {
     return balance;
 }
}

class CheckingAccount extends Account {
 public CheckingAccount(double initialBalance) {
     super(initialBalance);
 }

 @Override
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited ₹" + amount + " to Checking Account");
 }

 @Override
 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println("Withdrawn ₹" + amount + " from Checking Account");
     } else {
         System.out.println("Insufficient balance in Checking Account");
     }
 }

 @Override
 public double getBalance() {
     return balance;
 }
}

//3. Final Implementation
class Transaction {
 private final double transactionFee = 10.0; // Fixed transaction fee

 public final void performTransaction(Account account, double amount, String type) {
     if (type.equalsIgnoreCase("deposit")) {
         account.deposit(amount);
     } else if (type.equalsIgnoreCase("withdraw")) {
         account.withdraw(amount + transactionFee); // include transaction fee
         System.out.println("Transaction fee of ₹" + transactionFee + " applied");
     } else {
         System.out.println("Invalid transaction type");
     }

     System.out.println("Final Balance: ₹" + account.getBalance());
 }
}

//Main class to run the system
public class BankingTransactionSystem {
 public static void main(String[] args) {
     // Static demo
     new Bank();
     new Bank();
     System.out.println("Total Bank Accounts Created: " + Bank.getTotalAccounts());

     // Abstract demo
     Account savings = new SavingsAccount(1000);
     Account checking = new CheckingAccount(500);

     // Final demo
     Transaction t = new Transaction();

     System.out.println("\n-- Savings Account Transaction --");
     t.performTransaction(savings, 500, "deposit");
     t.performTransaction(savings, 200, "withdraw");

     System.out.println("\n-- Checking Account Transaction --");
     t.performTransaction(checking, 300, "deposit");
     t.performTransaction(checking, 600, "withdraw");
 }
}