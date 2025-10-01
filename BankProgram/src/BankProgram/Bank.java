package BankProgram;

import java.io.FileWriter;
import java.io.IOException;

public abstract class Bank {
	protected String accountName;
	protected double balance;
	
	public Bank(String accountName, double balance) {
		this.accountName = accountName;
		this.balance = balance;
	}
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract double getBalance();
	
	protected void recordTransaction(String transaction) {
		try (FileWriter writer = new FileWriter("Bank.txt", true)) {
			writer.write(transaction + "\n");
		} catch (IOException e) {
			System.out.println("Error writing to file: " + e.getMessage());
		}
	}
}
