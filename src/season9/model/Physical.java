package season9.model;

import season9.model.enums.TaxType;

public class Physical extends TaxPayer {
	private Double healthSpending;

	public Physical() {
		super();
	}

	public Physical(String name, Double annualIncome, TaxType taxType, Double healthSpending) {
		super(name, annualIncome, taxType);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public double taxPayment() {
		double tax = 0.0;
		if (this.getAnnualIncome() < 20000.00) {
			tax += getAnnualIncome() * 0.15;
		} else {
			tax += getAnnualIncome() * 0.25;
		}
		if (this.healthSpending > 0.0) {
			tax -= this.healthSpending * 0.5;
		}
		return tax;
	}
}
