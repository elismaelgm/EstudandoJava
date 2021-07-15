package exercicios_04;

import java.util.Scanner;

public class Exercicios06 {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++ ) {
			if (n % i == 0)
				System.out.println(i);
		}
		
		sc.close();
	}

}
