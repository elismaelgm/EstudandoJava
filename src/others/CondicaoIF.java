package others;
import java.util.Scanner;

public class CondicaoIF {

	public static void main(String[] args) {
		
		int hora;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia");
		} else {
			if (hora < 18) {
				System.out.println("Boa tarde");
			} else {
				System.out.println("Boa noite");
			}
		}
		
		sc.close();
	}

}
