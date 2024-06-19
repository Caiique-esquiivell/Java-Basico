package Model;

public class Company extends TaxPayer {
	
	private int numberOfEmployees;

	public Company(String name, Double anualIncome, int numberOfEmployees ) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getHealthExpenditures() {
		return numberOfEmployees;
	}

	public void setHealthExpenditures(int healthExpenditures) {
		this.numberOfEmployees = healthExpenditures;
	}
	
	@Override
	public Double tax() {
		if (numberOfEmployees > 10) {
			return getAnualIncome() * 0.14;
		}
		else {
			return getAnualIncome() * 0.16;
		}
	}

}
