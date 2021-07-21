package orderClient;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private Date moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<OrderItem>();
	private static SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
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

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.add(item);
	}
	
	public Double total() {
		double total = 0.0;
		for (OrderItem o : items) {
			total += o.subTotal();
		}
		return total;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Oder moment: " + sdf.format(getMoment()) + "\n");
		sb.append("Order statud: " + getStatus() + "\n");
		sb.append("Client: " + getClient().toString() + "\n");
		sb.append("Order items:\n");
		
		for (OrderItem item : items) {
			sb.append(item.toString() + "\n");
		}
		
		sb.append("Total price: $" + String.format("%.2f", total()));
		
		
		return sb.toString();
	}
}