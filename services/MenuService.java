package services;

import java.util.ArrayList;
import java.util.List;

import restraunt.components.Topping;
import restraunt.items.Item;

public class MenuService {

	private List<Item> availableItems;
	private ValidationService validator;
	
	public MenuService() {
		this.availableItems= new ArrayList();
		intializeMenu();
		this.validator = null; 
	}

	private void intializeMenu() {
		List<Topping> empty = new ArrayList();
		availableItems.add(new  Burger())
	}
}
