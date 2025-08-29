package restraunt.components;
import java.util.*;
public class Topping {

	private String name;
	private double price;
	private boolean available;
	private String category;
	
	public Topping(String name, double price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getCategory() {
		return category;
	}
	
	public boolean isAvailable() {
		return available;
	}
	
	public void setAvailable(boolean available) {
		this.available=available;
	}
	
	public List getAvailableToppings() {
		return list;
	}
	
	List<String> list = new ArrayList<>(List.of("Lettuce", "Tomato", "Onion", 
										"Cheese", "Mushroom", "Spinach", "Capsicum"));

}
