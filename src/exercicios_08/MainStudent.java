package exercicios_08;

import java.util.Scanner;

public class MainStudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[10];
		
		System.out.print("How many rooms will be reted? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			
			System.out.println("Rent #" + i);
			
			System.out.print("Name: ");
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			students[room] = new Student(nome, email, room);
			System.out.println();
		}
		
		System.out.println("Busy rooms:");
		for (Student student : students) {
			if (student != null)
			System.out.println(student);
		}
		
		sc.close();
	}
	
}