package exercicios_07;

public class Account {

	private int number;
	private String accountHolder;
	private double balance;
	private static double TAXA_SAQUE = 5.00;
	
	public Account(int number, String accountHolder, double initialDeposit) {
		this.number = number;
		this.accountHolder = accountHolder;
		this.deposit(initialDeposit);
	}

	public Account(int number, String accountHolder) {
		this.number = number;
		this.accountHolder = accountHolder;
	}

	public int getNumber() {
		return number;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withDraw(double amount) {
		this.balance -= (amount + TAXA_SAQUE);
	}
	
	public String toString() {
		return "Account " + getNumber() + ", Holder: " + getAccountHolder() + ", Balance: $ " + String.format("%.2f", getBalance());
	}
}
