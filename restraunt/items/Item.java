package restraunt.items;

import restraunt.components.Size;
import restraunt.components.ItemType;

public abstract class Item {

	private String name;
	private ItemType type;
	private Size size;
	private double basePrice;
	
	
	public Item(String name, ItemType type, Size size, double basePrice) {
		this.name = name;
		this.type = type;
		this.size = size;
		this.basePrice=basePrice;
	}
	
	public String getName() {
		return this.name;
	}
	public ItemType getType() {
		return type;
	}
	public Size getSize() {
		return size;
	}
	public double getBasePrice() {
		return basePrice;
	}

	public String getDisplayInfo() {
		return "Item [name=" + name + ", type=" + type + ", size=" + size + ", basePrice=" + basePrice + "]";
	}
	
	public void setSize(Size size) {
		this.size=size;
	}
	
	public abstract boolean isValid();
	public abstract double calculatePrice();
	
}
