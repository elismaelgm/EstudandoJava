package exercicios_06;

public class CurrencyConverter {

	public static final double IOF = 6.0;
	
	public static double converter(double priceDollar, double valueDollar) {
		double valueReais = priceDollar * valueDollar;
		return  valueReais + valueReais * IOF / 100;
	}
	
}