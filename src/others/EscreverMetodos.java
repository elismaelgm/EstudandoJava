package others;
import java.util.Scanner;

public class EscreverMetodos {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite três números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = max(a, b, c);
		
		showResult(result);
		
		sc.close();
		
	}
	
	private static void showResult(int result) {
		
		System.out.println("result: " + result);
		
	}

	public static int max(int a, int b, int c) {
		
		if (a > b && a > c) {
			return a;
		} else {
			if (b > c && b>a) {
				return b;
			} else 
				return c;
		}
		
	}
	
}
