package others;
import java.util.Scanner;

public class RepeticaoWhile {

	public static void main(String[] args) {

		int numero, soma;
		Scanner sc = new Scanner(System.in);
		
		numero = sc.nextInt();
		soma = numero;
		
		while (numero != 0) {
			numero = sc.nextInt();
			soma += numero;
		}
		System.out.println(soma);
		sc.close();
	}

}
