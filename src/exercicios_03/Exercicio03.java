package exercicios_03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int tipoCombust�vel, alcool = 0, gasolina = 0, diesel = 0;
		Scanner sc = new Scanner(System.in);
		
		
		tipoCombust�vel = sc.nextInt();
		
		while (tipoCombust�vel != 4) {
			
			alcool += (tipoCombust�vel == 1) ? 1 : 0;
			gasolina += (tipoCombust�vel == 2) ? 1 : 0;
			diesel += (tipoCombust�vel == 3) ? 1 : 0;
			
			tipoCombust�vel = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
		
	}

}
