package others;
import java.util.Locale;

public class Concatenacao {

	public static void main(String[] args) {
		
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.5;
		double measure = 53.234567;
		
		System.out.println("Products");
		System.out.println(product1 + ", which price is $ " + price1);
		System.out.println(product2 + ", which price is $ " + price2);
		System.out.println();
		System.out.printf("Record: %d year old, cod %d and gender: %s%n", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
				
	}

}