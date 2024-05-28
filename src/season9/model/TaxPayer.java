package season9.model;

import season9.model.enums.TaxType;

public abstract class TaxPayer {
	private String name;
	private Double annualIncome;
	private TaxType taxType;

	public TaxPayer() {
	}

	public TaxPayer(String name, Double annualIncome, TaxType taxType) {
		this.name = name;
		this.annualIncome = annualIncome;
		this.taxType = taxType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public TaxType getTaxType() {
		return taxType;
	}

	public void setTaxType(TaxType taxType) {
		this.taxType = taxType;
	}

	public abstract double taxPayment();
}
