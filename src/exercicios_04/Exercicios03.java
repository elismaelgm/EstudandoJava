package exercicios_04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		int valor;
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		
		valor = sc.nextInt();
		
		for (int i = 0; i < valor; i++) {
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			double valor3 = sc.nextDouble();
			
			soma = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10;
			
			System.out.printf("%.1f%n", soma);
		}
		
		sc.close();
	}

}
