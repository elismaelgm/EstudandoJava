package tax;

public class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	public Individual() {
		
	}

	public Individual(String nome, Double annualIncome, Double healthExpenditures) {
		super(nome, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		double tax;
		if (getAnnualIncome() < 20000.0) {
			tax = 0.15 * getAnnualIncome() - 0.5 * getHealthExpenditures(); 
		} else {
			tax = 0.25 * getAnnualIncome() - 0.5 * getHealthExpenditures();
		}
		return tax;
	}
}
