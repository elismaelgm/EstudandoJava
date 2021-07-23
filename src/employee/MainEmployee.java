package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainEmployee {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> listEmployee = new ArrayList<Employee>(); 
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char answer = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			sc.nextLine();
			if (answer == 'y') {
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				listEmployee.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				listEmployee.add(new Employee(name, hours, valuePerHour));
			}
			
				
		}
		
		
		System.out.println();
		System.out.println("PAYMENTS:");
		
		for (Employee emp : listEmployee) {
			System.out.println(emp.toString());
		}
		sc.close();

	}

}
