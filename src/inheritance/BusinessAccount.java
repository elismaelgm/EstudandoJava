package inheritance;

public class BusinessAccount extends Account {
	
	private Double loanLimit;
	private static final Double RATE_WITHDRAW_BUSINESSACCOUNT = 2.0;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= this.loanLimit) {
			this.deposit(amount);
			this.loanLimit -= amount;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		if (amount <= this.balance) { 
			super.withdraw(amount);
			this.balance -= RATE_WITHDRAW_BUSINESSACCOUNT;
		}
	}
}
