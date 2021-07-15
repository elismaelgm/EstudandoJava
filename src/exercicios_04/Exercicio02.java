package exercicios_04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		int valor, contador = 0;
		Scanner sc = new Scanner(System.in);
		
		valor = sc.nextInt();
		
		for (int i = 1; i <= valor; i++) {
			int valorIntervalo = sc.nextInt();
			if (valorIntervalo >= 10 && valorIntervalo <= 20)
				contador++;
		}
		
		System.out.println(contador + " in");
		System.err.println(valor - contador + " out");
		
		sc.close();
	}

}
