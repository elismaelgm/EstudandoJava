package hashCodeEquals;

public class MainClient {

	
	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		Integer s1 = Integer.parseInt("1");
		Integer s2 = Integer.parseInt("1");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2); // Referencia de memoria //Memoria Heap
		System.out.println(s1 == s2);
	}
}
