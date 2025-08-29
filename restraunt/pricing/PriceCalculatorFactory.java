package restraunt.pricing;

import restraunt.components.ItemType;
import restraunt.items.Item; 

public class PriceCalculatorFactory {

	public PriceCalculator createCalculator(ItemType itemType) {
		if(itemType == null) throw new IllegalArgumentException("The itemtype cannot be Null.");
		
		return switch(itemType) {
		case BURGER -> new BurgerPriceCalculator();
		case DRINK -> new DrinkPriceCalculator();
		case ADDON -> new AddOnPriceCalculator();
		default -> throw new IllegalArgumentException ("Unsupported item type: "+itemType);
		};
	}
	
	public PriceCalculator createCalculator(Item item) {
		if(item == null) throw new IllegalArgumentException("The item cannot be Null.");
		return createCalculator(item.getType());
	}
}
