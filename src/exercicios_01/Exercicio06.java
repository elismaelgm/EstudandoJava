package exercicios_01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		double a, b, c, areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		areaTrianguloRetangulo = a * c / 2;
		System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRetangulo);
		
		areaCirculo = 3.14159 * Math.pow(c, 2.0);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		
		areaTrapezio = (a + b) / 2 * c;
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		
		areaQuadrado = b * b;
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		
		areaRetangulo = a * b;
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		
		sc.close();
	}

}
