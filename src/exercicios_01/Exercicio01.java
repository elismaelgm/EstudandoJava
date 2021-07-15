package exercicios_01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int x,y,soma;
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.println("Soma = " + soma);
		
		sc.close();
	}

}
