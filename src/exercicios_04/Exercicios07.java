package exercicios_04;

import java.util.Scanner;

public class Exercicios07 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++ ) {
			System.out.printf("%.0f %.0f %.0f%n", (double) i, Math.pow(i, 2), Math.pow(i, 3));
		}
		
		sc.close();
		
	}
	
}
