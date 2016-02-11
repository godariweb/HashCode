package models;

public class Product implements Comparable<Product>{

	int type;
    int quantity;
    Location locationToBeDeliver;
    
	public Product(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public int compareTo(Product o) {
		return Integer.compare(this.type, o.type);
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Location getLocationToBeDeliver() {
		return locationToBeDeliver;
	}

	public void setLocationToBeDeliver(Location locationToBeDeliver) {
		this.locationToBeDeliver = locationToBeDeliver;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	
}
