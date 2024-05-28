package season16.functionalInterfaces.entities;

public class Product {
	private String name;
	private Double price;

	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public boolean getTestNonStatic() {
		return this.price < 1000.00;
	}

	public void getAcceptNonStatic() {
		this.setPrice(this.getPrice() * 1.1);
	}

	public String getApplyNonStatic() {
		return this.getName().toUpperCase();
	}

	@Override
	public String toString() {
		return "Name: " + this.name + " - " + "Price: " + String.format("%.2f", this.price);
	}
}
