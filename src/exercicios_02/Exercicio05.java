package exercicios_02;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		int codigo, qtd;
		double valorTotal;
		Scanner sc = new Scanner(System.in);
		Map<Integer, Double> tabelaValores = new HashMap<Integer, Double>();
		
		
		tabelaValores.put(1, 4.00);
		tabelaValores.put(2, 4.50);
		tabelaValores.put(3, 5.00);
		tabelaValores.put(4, 2.00);
		tabelaValores.put(5, 1.50);
		
		codigo = sc.nextInt();
		qtd = sc.nextInt();
		
		valorTotal = tabelaValores.get(codigo) * qtd;
		
		System.out.printf("Total: R$ %.2f", valorTotal);
		
		
		sc.close();
	}
	
}
