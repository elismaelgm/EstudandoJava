
public class FuncoesString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		System.out.println("Original: -" + original + "-");
		// Letras minusculas
		String s01 = original.toLowerCase();
		System.out.println("LowerCase: -" + s01 + "-");
		
		// Letras minusculas
		String s02 = original.toUpperCase();
		System.out.println("UpperCase: -" + s02 + "-");
		
		// Tira espaços
		String s03 = original.trim();
		System.out.println("trim: -" + s03 + "-");
		
		// Subtring
		String s04 = original.substring(2);
		System.out.println("substring(2): -" + s04 + "-");
		String s05 = original.substring(2,9);
		System.out.println("substring(2,9): -" + s05 + "-");
		
		// Replace
		String s06 = original.replace('a', 'x');
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		String s07 = original.replace("abc", "xy");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		
		// Posição
		int s08 = original.indexOf("bc");
		System.out.println("indexOf(\"bc\"): -" + s08 + "-");
		int s09 = original.lastIndexOf("bc");
		System.out.println("lastIndexOf(bc): -" + s09 + "-");
		
		// Split
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}
}
