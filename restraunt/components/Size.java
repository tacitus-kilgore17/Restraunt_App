package restraunt.components;

public enum Size {
	SMALL(1.0, "S"),
	MEDIUM(1.4,"M"),
	LARGE(1.8,"L"),
	XLARGE(2.25,"X");
	
	private final double multiplier;
	private final String displayName;
	
	private Size(double multiplier, String displayName) {
		this.multiplier = multiplier;
		this.displayName = displayName;
	}

	public double getMultiplier() {
		return multiplier;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public static void main(String[] args) {
        System.out.println("Testing Size enum:");
        for (Size size : Size.values()) {
            System.out.println(size.name() + " - " + 
                             size.getDisplayName() + 
                             " (x" + size.getMultiplier() + ")");
        }
    }
	
}
