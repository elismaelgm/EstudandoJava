package generics;

import java.util.Arrays;
import java.util.List;

public class TipoCoringa {

	
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,2,10);
		printList(list);
		
		List<String> mylist = Arrays.asList("Maria", "Bob", "João");
		printList(mylist);
	}
	
	public static void printList(List<?> list) {
		for (Object obg : list) {
			System.out.println(obg);
		}
	}
	
}
