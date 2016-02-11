package models;

import java.lang.reflect.Array;
import java.util.ArrayList;

import com.Utils;

public class Order implements Comparable<Order>{

	Location locationToBeDelivered;
	ArrayList<Product> productsToBeDelibered;
	
	public Order(Location locationToBeDelivered, ArrayList<Product> productsToBeDelibered) {
		this.locationToBeDelivered = locationToBeDelivered;
		this.productsToBeDelibered = productsToBeDelibered;
	}
	
	
	public void selectBestDroneForOrder(ArrayList<Drone> listOfAvaiableDrones,int numberOfProducts,int productType,ArrayList<Warehouse> listOfWarehouses,
				Location destinationCordonates) {
		
		Drone winingDrone = null;
		
		ArrayList<Warehouse> eligibleWarhouse = new ArrayList<Warehouse>();
		for (int i=0; i<listOfWarehouses.size(); i++){			
			if(Utils.getNumberOfProduct(listOfWarehouses.get(i).getProducts(), productType) == numberOfProducts){
				eligibleWarhouse.add(listOfWarehouses.get(i));
		    }
				
		}
		
		DroneWarehouseCombination bestCombination;
		
		int max = 0;
		
		for(int i=0; i < listOfAvaiableDrones.size(); i++) {
			
			ArrayList<Integer> sums = new ArrayList<Integer>(); 
			
			for(int j=0; j < eligibleWarhouse.size(); j++) {
				int locationDroneWarhouse = listOfAvaiableDrones.get(i).getCurrentLocattion().distanceToOtherLocation( eligibleWarhouse.get(j).getLocation());
				int locationWarhouseDestination =eligibleWarhouse.get(j).getLocation().distanceToOtherLocation(destinationCordonates);
				sums.add(locationDroneWarhouse + locationWarhouseDestination);
				
				if()
				
				bestCombination
				
				combinations.add(new DroneWarehouseCombination(eligibleWarhouse.get(j), listOfAvaiableDrones.get(i), locationDroneWarhouse + locationWarhouseDestination));
			
			}
		}
		
		
		
	}
	
	
	public static class DroneWarehouseCombination {
		Warehouse warehouse;
		Drone drone;
		int distance;
		
		public DroneWarehouseCombination(Warehouse warehouse, Drone drone, int distance) {
			this.warehouse = warehouse;
			this.drone = drone;
			this.distance = distance;
			
		}
		public Warehouse getWarehouse() {
			return warehouse;
		}
		public Drone getDrone() {
			return drone;
		}
		public int getDistance() {
			return distance;
		}
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
