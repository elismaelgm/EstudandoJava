package exercicios_04;

import java.util.Scanner;

public class Exercicios05 {

	public static void main(String[] args) {
		
		int n, resultado = 1;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		if (n == 0) {
			System.out.println("1");
		} else {
			for (int i = 1; i <= n; i++) {
				resultado *= i;
			}
			System.out.println(resultado);
		}
		
		sc.close();
	}

}
