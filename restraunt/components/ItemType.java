package restraunt.components;

public enum ItemType {

	BURGER("Burger"),
	DRINK("Drink"),
	ADDON("Add-On");
	
	private final String displayName;

	private ItemType(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	
}
