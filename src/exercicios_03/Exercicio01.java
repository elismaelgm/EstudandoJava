package exercicios_03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int valorSenha = 2002;
		int valorSenhaDigitada;
		Scanner sc = new Scanner(System.in);
		
		valorSenhaDigitada = sc.nextInt();
		
		while (valorSenha != valorSenhaDigitada) {
			System.out.println("Senha Invalida");
			valorSenhaDigitada = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		
		sc.close();
		
	}

}
