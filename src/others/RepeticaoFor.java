package others;
import java.util.Scanner;

public class RepeticaoFor {

	public static void main(String[] args) {
		
		int quantIteracoes, soma = 0;
		Scanner sc = new Scanner(System.in);
		
		quantIteracoes = sc.nextInt();
		
		for (int i = 1; i <= quantIteracoes; i++) {
			soma += sc.nextInt();
		}
		
		System.out.println(soma);
		sc.close();
		
	}

}
