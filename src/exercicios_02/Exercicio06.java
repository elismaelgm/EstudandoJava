package exercicios_02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		int fimIntervalo1 = 25;
		int fimIntervalo2 = 50;
		int fimIntervalo3 = 75;
		int fimIntervalo4 = 100;
		
		double valor;
		Scanner sc = new Scanner(System.in);
		
		valor = sc.nextDouble();
		
		if (valor < 0) {
			System.out.println("Fora de intervalo");
		} else {
			if (valor <= fimIntervalo1) {
				System.out.println("Intervalo [0,25]");
			} else {
				if (valor <= fimIntervalo2) {
					System.out.println("Intervalo (25,50]");
				} else {
					if (valor <= fimIntervalo3) {
						System.out.println("Intervalo (50,75]");
					} else {
						if (valor <= fimIntervalo4) {
							System.out.println("Intervalo (75,100]");
						}
					}
				}
			}
		}
		sc.close();
	}

}
