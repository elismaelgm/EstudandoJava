package product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainProduct {

	public static void main(String[] args) throws ParseException {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<Product>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char answer = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			switch (answer) {
			case 'c':
				list.add(new Product(name, price));
				break;
			case 'u':
				System.out.print("Manufactore date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
				break;
			case 'i':
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
				break;
			default:
				System.out.println("Valor de entrada errada!");
				break;
			}
			
		}

		System.out.println();
		
		System.out.println("PRICE TAGS:");
		
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}

}
