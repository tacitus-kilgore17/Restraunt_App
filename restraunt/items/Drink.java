package restraunt.items;
import restraunt.components.Size;
import restraunt.components.ItemType;

public class Drink extends Item{

	private boolean cold;
	private String flavour;
	private boolean sugarfree;
	
	
	public Drink(String name, String type, String size, boolean cold, String flavour, boolean sugarfree) {
		super(name, type, size);
		this.cold = cold;
		this.flavour = flavour;
		this.sugarfree = sugarfree;
	}
	
	
}
