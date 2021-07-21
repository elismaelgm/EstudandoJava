package orderClient;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MainOrder {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
			
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date date = sdf.parse(sc.next());
		Client client = new Client(name, email, date);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String statusOrder = sc.next();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(statusOrder), client); 
		
		System.out.println("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			sc.nextLine();
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(quantity, product);
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println(order.toString());
		
		sc.close();
	}
}
