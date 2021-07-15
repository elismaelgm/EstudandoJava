package exercicios_03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int tipoCombustível, alcool = 0, gasolina = 0, diesel = 0;
		Scanner sc = new Scanner(System.in);
		
		
		tipoCombustível = sc.nextInt();
		
		while (tipoCombustível != 4) {
			
			alcool += (tipoCombustível == 1) ? 1 : 0;
			gasolina += (tipoCombustível == 2) ? 1 : 0;
			diesel += (tipoCombustível == 3) ? 1 : 0;
			
			tipoCombustível = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
		
	}

}
