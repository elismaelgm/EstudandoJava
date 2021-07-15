package exercicios_01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int a, b;
		double c, salario;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextDouble();
		
		salario = b * c;
		
		System.out.println("Número = " + a);
		System.out.printf("Salario = U$ %.2f%n", salario);
		
		sc.close();
	}
}
