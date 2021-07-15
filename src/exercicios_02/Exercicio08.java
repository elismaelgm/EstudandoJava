package exercicios_02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		double valorEntrada, valorCalulado;
		Scanner sc = new Scanner(System.in);
		
		valorEntrada = sc.nextDouble();
		
		if (valorEntrada <= 2000.00) {
			System.out.println("Isento");
		} else {
			if (valorEntrada <= 3000.00) {
				valorEntrada -= 2000.00;
				valorCalulado = valorEntrada * 0.08;
				System.out.printf("R$ %.2f", valorCalulado);
			} else {
				if (valorEntrada <= 4500.00) {
					valorEntrada -= 3000.00;
					valorCalulado = 1000.0 * 0.08 + valorEntrada * 0.18 ;
					System.out.printf("R$ %.2f", valorCalulado);
				} else {
					valorEntrada -= 4500.00;
					valorCalulado = 1000.0 * 0.08 + 1500.0 * 0.18 + valorEntrada * 0.28 ;
					System.out.printf("R$ %.2f", valorCalulado);
				}
			}
		}
		
		
		sc.close();
		
	}

}
