package restraunt;
import restraunt.prices.*;
public class PriceCalulator {

	public double calulatePrice(Item item) {
		String name = item.getName().toLowerCase();
		String size = item.getSize().toLowerCase();
		
		double typePrice = switch(name) {
		case "burger" -> {
			Burger burger = (Burger) item;
			BurgerPrice bp = new BurgerPrice();
			yield bp.getTypePrice(burger);
		}
		
		
		default -> throw new IllegalArgumentException();
		};
		
		double multiplier = switch(size) {
		case "s" -> 1.00;
		case "m" -> 1.45;
		case "l" -> 1.85;
		case "xl" -> 2.40; 
		
		default ->throw new IllegalArgumentException("Unexpected value: " + size);
		};
		
		return typePrice*multiplier;
	}
}
