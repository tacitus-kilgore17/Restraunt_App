package restraunt.pricing;

import restraunt.items.Item;
import restraunt.items.Burger;
import restraunt.components.Size;
import restraunt.components.Topping;
import java.util.List;

public class BurgerPriceCalculator implements PriceCalculator{

	final double TAX_RATE = 0.08;
	final double DEFAULT_BURGER_PRICE=99;
	@Override
	public double calculatePrice(Item item) {
		if(!(item instanceof Burger)) {
			throw new IllegalArgumentException("This item is not a Burger");
		}
		
		Burger burger = (Burger) item;
		
		double basePrice = getBasePrice(burger.getName());
		double toppingPrice = calculateToppingPrice(burger.getToppings());
		double priceMutilplier = calculateSizeMultiplier(burger.getSize());
		
		double subtotal = (basePrice+toppingPrice)*priceMutilplier;
		
		return applyTaxes(subtotal);
	}
	
	private double getBasePrice(String burgerName) {
		return switch(burgerName.toLowerCase().replaceAll("[\\s_\\-]", "")) {
		case "cheeseburger" -> 179;
		case "paneerburger" -> 149;
		case "aalotikkiburger" -> 119;
		case "hamburger" -> 199;
		case "deluxeburger" -> 249;
		default -> DEFAULT_BURGER_PRICE;
		};
	}
	
	private double calculateToppingPrice(List<Topping> list) {
		return list.stream().
				mapToDouble(Topping::getPrice).
				sum();
	}
	
	private double calculateSizeMultiplier(Size size) {
		return size.getMultiplier();
	}

	@Override
	public double applyTaxes(double amount) {
		
		return amount * (1+TAX_RATE);
	}

	
}
