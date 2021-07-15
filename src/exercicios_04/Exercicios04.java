package exercicios_04;

import java.util.Scanner;

public class Exercicios04 {

	public static void main(String[] args) {
		
		int qtdIteracoes;
		Scanner sc = new Scanner(System.in);
		
		qtdIteracoes = sc.nextInt();
		
		for (int i = 1; i <= qtdIteracoes; i++) {
			int valor1 = sc.nextInt();
			int valor2 = sc.nextInt();
			
			if (valor2 == 0)
				System.out.println("divisao impossivel");
			else {
				double div = (double) valor1 / valor2;
				System.out.printf("%.1f%n", div);
			}
		}
		
		sc.close();
		
	}
	
}