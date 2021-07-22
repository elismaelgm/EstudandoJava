package inheritance;

public class Account {

	private Integer number;
	private String holder;
	protected Double balance;
	private static final Double RATE_WITHDRAW = 5.0;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		if (amount <= this.balance)
			this.balance -= (amount + RATE_WITHDRAW);
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
}