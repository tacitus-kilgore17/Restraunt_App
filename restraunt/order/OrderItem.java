package restraunt.order;

import restraunt.items.Item;

public class OrderItem {

	private Item item;
	private int quantity;
	private double itemTotal;
	
	public OrderItem(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
		this.itemTotal = calculateItemTotal();
	}

	public double calculateItemTotal() {
		return  item.calculatePrice()* quantity;
	}

	public Item getItem() {
		return item;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getItemTotal() {
		return itemTotal;
	}
	
}
