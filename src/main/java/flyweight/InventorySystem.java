package flyweight;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {

	
	private Catalog catalog = new Catalog();
	private List<Order> orders = new CopyOnWriteArrayList<Order>();

	public void takeOrder(String itemName, int orderNumber) {
		
		Item item = catalog.lookup(itemName);
		Order order = new Order(orderNumber, item);
		orders.add(order);	
		
	}
	
	public void process() {
		
		for(Order o:orders) {
			o.processOrder();
			orders.remove(o);
		}
	}
		public String report() {
			return "\nTotal Item objects made: "+catalog.totalItemsMade();
			
		}
	
}
