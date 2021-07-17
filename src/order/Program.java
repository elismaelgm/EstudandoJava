package order;

import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		order.setStatus(OrderStatus.valueOf("DELIVERED"));
		
		System.out.println(order);
		
	}
}
