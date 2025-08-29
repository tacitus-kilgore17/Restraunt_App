package restraunt.order;

import java.time.LocalDateTime;
import java.util.List;
import restraunt.items.Item;

public class Order {

	private String orderId;
	private  List<OrderItem> items;
	private double totalPrice;
	private OrderStatus status;
	private LocalDateTime orderTime;
	
	public void addItem(Item item, int quantity) {
		items.add(new OrderItem(item, quantity));
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public void removeItem(String item) {
		if(items.contains(item)) items.remove(item);
		else System.out.println("The item is not in the list.");
	}
	
	public double calculateTotal() {
		totalPrice=items.stream().
				mapToDouble(OrderItem::getItemTotal).
				sum();
		return totalPrice;
	}
	
}
