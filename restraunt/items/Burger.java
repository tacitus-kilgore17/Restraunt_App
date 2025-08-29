package restraunt.items;
import java.util.*;
import restraunt.components.Size;
import restraunt.components.ItemType;
import restraunt.components.Topping;
import restraunt.pricing.PriceCalculatorFactory;

public class Burger extends Item{
	
	private List<Topping> toppings;
	private final int MIN_TOPPINGS=3;
	private final int MAX_AVAILABLE_TOPPINGS=7;
	
	public Burger(String name, Size size, double basePrice, List<Topping> toppings) {
	    super(name, ItemType.BURGER, size, basePrice);  // You set the type!
	    this.toppings = toppings;
	}
	
	public List<Topping> getToppings(){
		return this.toppings;
	}
	
	@Override
	public double calculatePrice() {
		PriceCalculatorFactory calc = new PriceCalculatorFactory();
		return calc.createCalculator(super.getType()).calculatePrice(this);
	}
	@Override
	public boolean isValid() {
		return toppings != null && toppings.size()>=MIN_TOPPINGS && !toppings.contains(null);
	}
	
	public boolean addTopping(Topping topping) {
		if(topping == null) throw new IllegalArgumentException("The topping cannot be Null.");
		if(toppings.size()<MAX_AVAILABLE_TOPPINGS) {
			toppings.add(topping);
			return true;
		} 
		return false;
	}
	
	public boolean removeTopping(Topping topping) {
		if(topping == null) throw new IllegalArgumentException("The topping cannot be Null.");
		if(toppings.size()>MIN_TOPPINGS) return toppings.remove(topping);
		
		return false;
	}
	
	
	public String getDisplayInfo() {
		   StringBuilder toppingsStr = new StringBuilder();
		   if (toppings != null && !toppings.isEmpty()) {
		       for (int i = 0; i < toppings.size(); i++) {
		           toppingsStr.append(toppings.get(i).getName());
		           if (i < toppings.size() - 1) {
		               toppingsStr.append(", ");
		           }
		       }
		   } else {
		       toppingsStr.append("No toppings");
		   }
		   
		   return String.format("%s %s ($%.2f) - Toppings: %s", 
		                       getSize().getDisplayName(), 
		                       getName(), 
		                       calculatePrice(), 
		                       toppingsStr.toString());
		}
}
