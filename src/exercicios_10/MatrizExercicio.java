package exercicios_10;

import java.util.Scanner;

public class MatrizExercicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int linha = sc.nextInt();
		int coluna = sc.nextInt();
		
		int[][] matriz = new int[linha][coluna];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j - 1 >= 0)
						System.out.println("Left: " + matriz[i][j - 1]);
					if (j + 1 < coluna)
						System.out.println("Right: " + matriz[i][j + 1]);
					if (i - 1 >= 0)
						System.out.println("Up: " + matriz[i - 1][j]);
					if (i + 1 < linha)
						System.out.println("Down: " + matriz[i + 1][j]);
				}
			}
		}
		
		sc.close();
		
	}
	
}