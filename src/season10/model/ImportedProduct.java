package season10.model;

public class ImportedProduct extends Product {
	private Double customsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public double totalPrice() {
		return this.getPrice() + this.customsFee;
	}

	@Override
	public String priceTag() {
		return this.getName() + ": $" + this.totalPrice() + " (Customs fee: $" + this.customsFee + ")";
	}
}
