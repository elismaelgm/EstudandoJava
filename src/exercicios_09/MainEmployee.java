package exercicios_09;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainEmployee {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int numberEmployee = sc.nextInt();
		
		for (int i = 1; i <= numberEmployee; i++) {
			System.out.println("Employees #" + i);
			
			System.out.print("Id: ");
			int id =  sc.nextInt();
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employees.add(new Employee(id, name, salary));
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id =  sc.nextInt();
		
		Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exists!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage =  sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		
		System.out.println("List of employees:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		sc.close();
	}

}
