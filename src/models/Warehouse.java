package models;

import java.util.ArrayList;

public class Warehouse {

	Location location;
	ArrayList<Product> products;
	
	public Warehouse(Location location, ArrayList<Product> products) {
		this.location = location;
		this.products = products;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}
}
