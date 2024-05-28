package season9.model;

import season9.model.enums.TaxType;

public class Company extends TaxPayer {
	private Integer numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double annualIncome, TaxType taxType, Integer numberOfEmployees) {
		super(name, annualIncome, taxType);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double taxPayment() {
		double tax = 0.0;
		if (this.numberOfEmployees <= 10) {
			tax += this.getAnnualIncome() * 0.16;
		} else {
			tax += this.getAnnualIncome() * 0.14;
		}
		return tax;
	}
}
