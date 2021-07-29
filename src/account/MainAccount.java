package account;

import java.util.Locale;
import java.util.Scanner;

public class MainAccount {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
		
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amountWithDraw = sc.nextDouble();
			account.withDraw(amountWithDraw);
			System.out.print("New balance: " + String.format("%.2f", account.getBalance()));
		
		} catch (WithdrawException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
		
	}
	
}
