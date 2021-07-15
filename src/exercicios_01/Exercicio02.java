package exercicios_01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		double r, area;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		r = sc.nextDouble();
		area = 3.14159 * Math.pow(r, 2.0);
		
		System.out.printf("A = %.4f", area);
		
		sc.close();
	}
}
