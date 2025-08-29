package restraunt;

public class Menu {

	public static void main(String[] args) {
		Burger burger = new Burger("Burger","hamBUrger","M");
		System.out.println(burger.getName());
		System.out.println(burger.getAdjustedPrice());
		burger.printItem();
		
	}
	
}
