package BankProgram;

public class Account extends Bank {
	
	public Account(String accountName, double balance) {
		super(accountName, balance);
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
			recordTransaction(accountName + " deposited " + amount +
					", New Balance " + balance);
		} else {
			System.out.println("Deposit amount must be greater than 0.");
		}
	}
	
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn:" + amount);
			recordTransaction(accountName + " deposited " + amount +
					", New Balance " + balance);
		} else {
			System.out.println("Withdrawal amount exceeded account balance.");
			recordTransaction(accountName + " attempted withdrawal of " + amount + 
					" (FAILED: Insufficient funds)");
		}
	}
	
	public double getBalance() {
		System.out.println("Current Balance: " + balance);
		recordTransaction(accountName + " checked balance: " + balance);
		return balance;
	}
}
