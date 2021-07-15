package areaTriangulo;

import java.util.Scanner;

public class AreaTrianguloSemOrientacaoObjeto {

	public static void main(String[] args) {
		
		double xA, xB, xC, yA, yB, yC;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle X:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY)
			System.out.println("Larger area: X");
		else System.out.println("Larger area: Y");
		
		sc.close();
		
	}
	
}