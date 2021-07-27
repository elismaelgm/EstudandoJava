package tax;

public class Company extends TaxPayer {

	private int numberOfEmployees;
	
	public Company() {
		
	}

	public Company(String nome, Double annualIncome, int numberOfEmployees) {
		super(nome, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		double tax;
		
		if (getNumberOfEmployees() <= 10) {
			tax = getAnnualIncome() * 0.16;
		} else {
			tax = getAnnualIncome() * 0.14;
		}
		return tax;
	}
	
}
