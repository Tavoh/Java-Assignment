package BankProgram;

public class AccountTest {
	public static void main(String[] args) {
		
		Account acc = new Account("Kim Savanhu", 50000);
		
		acc.deposit(7500);
		
		acc.withdraw(5000);
		
		acc.withdraw(60000);
		
		acc.getBalance();
	}
}
