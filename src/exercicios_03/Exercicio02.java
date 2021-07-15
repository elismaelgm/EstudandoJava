package exercicios_03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int x, y;
		String saida;
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			
			saida = (x > 0 && y > 0) ? "Primeiro" : (x < 0 && y > 0) ? "Segundo" : (x < 0 && y < 0) ? "Terceiro" : "Quarto";
			System.out.println(saida);
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
		
	}

}
