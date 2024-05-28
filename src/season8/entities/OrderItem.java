package season8.entities;

public class OrderItem {
	private Product product;
	private Integer quantity;
	private Double price;

	public OrderItem() {
	}

	public OrderItem(Integer quantity, Product product) {
		this.product = product;
		this.quantity = quantity;
		this.price = this.quantity * this.product.getPrice();
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Product: " + this.product +
				", Product quantity: " + this.quantity +
				", Total price of product: " + this.price;
	}
}
