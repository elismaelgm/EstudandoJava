package others;
import java.util.Scanner;

public class CondicaoTernariaIF {

	public static void main(String[] args) {
		
		double preco;
		double desconto;
		Scanner sc = new Scanner(System.in);
		
		preco = sc.nextDouble();
		
		desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.printf("O desconto é de R$ %.2f", desconto);
		
		sc.close();
	}

}
