package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.service.BrazilTaxService;
import model.service.RentalService;


public class MainModel {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Enter rental data");
		
		System.out.print("Car model: ");
		String model = sc.nextLine();
		
		System.out.print("Pickup (dd/MM/yyyy hh:mm): ");
		Date start = sdf.parse(sc.nextLine());
		
		System.out.print("Return (dd/MM/yyyy hh:mm): ");
		Date finish = sdf.parse(sc.nextLine());
		
		CarRental cr = new CarRental(start, finish, new Vehicle(model));
		
		System.out.print("Enter price per hour: ");
		double pricePerHour = sc.nextDouble();
		
		System.out.print("Enter price per day: ");
		double pricePerDay = sc.nextDouble();
		
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		rentalService.processInvoice(cr);
		
		System.out.println();
		System.out.println("INVOICE:");
		
		System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoicle().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", cr.getInvoicle().getTax()));
		System.out.println("Total payment: " + String.format("%.2f", cr.getInvoicle().getTotalPayment()));
		
		sc.close();
		
	}
	
}
