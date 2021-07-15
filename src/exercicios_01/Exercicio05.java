package exercicios_01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		int cod01, qtd01, cod02, qtd02;
		double valorUnitario1, valorUnitario2, valorAPagar;
		Scanner sc = new Scanner(System.in);
		
		cod01 = sc.nextInt();
		qtd01 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		
		cod02 = sc.nextInt();
		qtd02 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		
		valorAPagar = qtd01 * valorUnitario1 + qtd02 * valorUnitario2; 
		
		System.out.printf("VALOR A PAGAR: R$ : %.2f", valorAPagar);
		
		sc.close();
	}

}
