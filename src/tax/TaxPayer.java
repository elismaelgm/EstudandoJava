package tax;

public abstract class TaxPayer {

	private String nome;
	private Double annualIncome;
	
	public TaxPayer() {
	}

	public TaxPayer(String nome, Double annualIncome) {
		this.nome = nome;
		this.annualIncome = annualIncome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	public abstract Double tax();
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getNome() + ": $");
		sb.append(String.format("%.2f", tax()));	
		return sb.toString();
	}
	
}
