package exercicios_06;

import java.util.Locale;
import java.util.Scanner;

public class MainCurrencyConverter {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double priceDollar;
		double valueDollar;
		
		System.out.println("What is the dollar price? ");		
		priceDollar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		valueDollar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais: %.2f", CurrencyConverter.converter(priceDollar, valueDollar));
		
		sc.close();
	}
	
}