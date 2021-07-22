package inheritance;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 1000.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);
		
		
		// UPCASTING
		Account acc1 = bacc;
		System.out.println(acc1.getHolder() + " - " + acc1.getBalance());
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
		System.out.println(acc2.getHolder() + " - " + acc2.getBalance());
		Account acc3 = new SavingsAccount(1004, "Anna", 1000.0, 0.01);
		System.out.println(acc3.getHolder() + " - " + acc3.getBalance());
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.00);
		System.out.println(acc4.getHolder() + " - " + acc4.getBalance());
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(100.00);
			System.out.println(acc5.getHolder() + " - " + acc5.getBalance());
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println(acc3.getHolder() + " - " + acc3.getBalance());
		}
		
		// SOBREPOSIÇÃO
		acc.withdraw(200.00);
		System.out.println(acc.getHolder() + " - " + acc.getBalance());
		
		acc3.withdraw(200.00);
		System.out.println(acc3.getHolder() + " - " + acc3.getBalance());
		
		acc2.withdraw(500.00);
		System.out.println(acc2.getHolder() + " - " + acc2.getBalance());
		
	}

}
