package exercicios_04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		int valor;
		Scanner sc = new Scanner(System.in);
		
		valor = sc.nextInt();
		
		for (int i = 1; i <= valor; i++) {
			if (i % 2 != 0)
				System.out.println(i);
		}

		sc.close();
	}

}
