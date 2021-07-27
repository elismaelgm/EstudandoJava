package tax;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainTaxPayer {
	
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<TaxPayer>();
		double totalTaxes = 0.0;
		
		System.out.print("Enter the number of tax payers: ");
		int numberTax = sc.nextInt();
		
		for (int i = 1; i <= numberTax ; i++) {
			
			System.out.print("Tax payer #" + i + " data: ");
			
			System.out.print("Individual or company (i/c)? ");
			char answer = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			
			if (answer == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, annualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, annualIncome, numberOfEmployees));
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for (TaxPayer taxPayer : list) {
			
			System.out.println(taxPayer.toString());
			totalTaxes += taxPayer.tax();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $%.2f", totalTaxes);
		
		sc.close();
	}

}
