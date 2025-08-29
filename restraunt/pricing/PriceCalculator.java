package restraunt.pricing;

import restraunt.items.Item;

public interface PriceCalculator {

	double calculatePrice(Item item);
	double applyTaxes(double tax);
}
