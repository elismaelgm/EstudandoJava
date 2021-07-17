package worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MainWorker {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		
		// DEPARTMENT INFORMATION
		System.out.print("Enter departament's name: ");
		Department department = new Department(sc.next());
		
		// WORKER INFORMATION
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Level: ");
		String level = sc.next();
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, department);
		
		
		// CONTRACT HOUR INFORMATION
		System.out.print("How many contracts to this worker? ");
		int numContracts = sc.nextInt();
		for (int i = 1; i <= numContracts; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf1.parse(sc.next());
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			Integer hours = sc.nextInt();
			HourContract hourContract = new HourContract(date, valuePerHour, hours);
			worker.addContract(hourContract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		Integer month = Integer.parseInt(monthAndYear.substring(0, 2));
		Integer year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

		sc.close();
	}

}
