package ui;

import java.util.Scanner;

import restraunt.order.Order;
import services.MenuService;
import services.OrderService;

public class CLIHandler {

	private MenuService menuService;
	private OrderService orderService;
	private Order currentOrder;
	private Scanner scanner;
	private MenuDisplay menuDisplay;
	private OrderDisplay orderDisplay;
	
	
	public CLIHandler(MenuService menuService, OrderService orderService) {
		
		this.menuService = menuService;
		this.orderService = orderService;
		this.scanner = new Scanner(System.in);
		this.menuDisplay = new MenuDisplay();
		this.orderDisplay = new OrderDisplay();		
		this.currentOrder = orderService.createOrder();
	}
	
	public void start() {
		displayWelcome();
		showMainMenu();
	}

	private void displayWelcome() {
		// TODO Auto-generated method stub
		
	}
	
	
}
