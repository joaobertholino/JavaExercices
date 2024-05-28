package season8.entities;

import season8.entities.enums.OrderStatus;

import java.time.Instant;
import java.util.ArrayList;

public class Order {
	private final ArrayList<OrderItem> items = new ArrayList<>();
	private Instant date;
	private Client client;
	private OrderStatus status;

	public Order() {
	}

	public Order(Instant date, Client client, OrderStatus status) {
		this.date = date;
		this.client = client;
		this.status = status;
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ArrayList<OrderItem> getItens() {
		return items;
	}

	public StringBuilder showItems() {
		StringBuilder s = new StringBuilder();
		for (OrderItem item : this.items) {
			s.append(item.toString()).append("\n");
		}
		return s;
	}

	public double subTotal() {
		double total = 0.0;
		for (OrderItem items : this.items) total += items.getPrice();
		return total;
	}
}
