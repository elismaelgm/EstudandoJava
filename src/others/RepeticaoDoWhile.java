package others;
import java.util.Locale;
import java.util.Scanner;

public class RepeticaoDoWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double temperaturaCelsius, temperaturaFahrenheit;
		String resposta;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			temperaturaCelsius = sc.nextDouble();
			temperaturaFahrenheit = 9 * temperaturaCelsius / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", temperaturaFahrenheit);
			System.out.print("Deseja Repetir (s/n): ");
			resposta = sc.next();
		} while (resposta.equals("s"));
		
		sc.close();
		
	}
}
