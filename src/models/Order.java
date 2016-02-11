package models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Order implements Comparable<Order>{

	Location locationToBeDelivered;
	ArrayList<Product> productsToBeDelibered;
	
	public Order(Location locationToBeDelivered, ArrayList<Product> productsToBeDelibered) {
		this.locationToBeDelivered = locationToBeDelivered;
		this.productsToBeDelibered = productsToBeDelibered;
	}

	public Location getLocationToBeDelivered() {
		return locationToBeDelivered;
	}

	public ArrayList<Product> getProductsToBeDelibered() {
		return productsToBeDelibered;
	}

	public int compareTo(Order arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
