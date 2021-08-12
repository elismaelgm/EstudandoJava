package device;

public class ComboDevice extends Device implements Printer, Scanner {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public String scan() {
		return "Combo scan result";
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo printing " + doc);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Combo processing: " + doc);
	}	
}
