package assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {


	public static void main(String[] args) {
		Chef ourChef = new Chef();
		Waiter ourWaiter = new Waiter(ourChef);
		Scanner scan = new Scanner(System.in);
		ArrayList<Order> orderList = new ArrayList<Order>();
		Order order = null;
		
		System.out.println("What would you like?: ");
		String food = scan.nextLine();
		
		System.out.println("What is your table number?: ");
		int tableNo = scan.nextInt();
		scan.nextLine();
		
		order = new Order(food, tableNo, false);
		orderList.add(order);
		
		ourWaiter.sendOrder(order);
		
		
	}
	

}
