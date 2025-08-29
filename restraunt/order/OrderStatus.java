package restraunt.order;

public enum OrderStatus {

	PENDING("Pending"),
	CONFIRMED("Confirmed"),
	PREPARING("Preparing"),
	READY("Ready"),
	DELIEVERED("Delievered"),
	CANCELLED("Cancelled");
	
	private final String displayName;

	private OrderStatus(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	
}
