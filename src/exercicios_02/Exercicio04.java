package exercicios_02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int horaInicial, horaFinal;
		Scanner sc = new Scanner(System.in);
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaFinal == horaInicial) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		} else {
			if (horaInicial < horaFinal) {
				System.out.println("O JOGO DUROU " + (horaFinal - horaInicial) + " HORA(S)");
			} else {
				System.out.println("O JOGO DUROU " + (24 + horaFinal - horaInicial) + " HORA(S)");
			}
		}
		
		sc.close();
	}

}