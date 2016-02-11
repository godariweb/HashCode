package com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import models.Command;
import models.InputDataObject;

import models.Command.CommandType;
import models.Drone;
import models.Location;
import models.Order;
import models.Product;

import utils.ReadFromFile;
import utils.WriteToFile;

public class Main {

	public static final String pathToIntFolder = "C:\\Users\\Bogdan\\Desktop\\facultate\\google hash code\\git\\HashCode\\src\\in";
	public static final String pathToOutFolder = "C:\\Users\\Bogdan\\Desktop\\facultate\\google hash code\\git\\HashCode\\src\\out";
	public static final String pathToIntFolderAndrei = "C:\\Users\\AncientMachine\\Desktop\\hashCode\\probleme\\HashCode\\src\\in";
	
	public static void main(String[] args) throws IOException {
		int step = 0; 
		
		ArrayList<Command> commands = new ArrayList<Command>();
		commands.add(new Command(0, CommandType.L, 0, 1, 1));
		
		WriteToFile wtf = new WriteToFile(pathToOutFolder);
		
		wtf.writeToFile("first", commands);
		
		InputDataObject busyDay = new InputDataObject(pathToIntFolder, "busy_day");
		InputDataObject motherOfAllWarehouses = new InputDataObject(pathToIntFolderAndrei, "mother_of_all_warehouses");
		InputDataObject redundancy = new InputDataObject(pathToIntFolder, "redundancy");
		ArrayList<Product> productsToBeDelivery = new ArrayList<Product>();
		for (Order order : motherOfAllWarehouses.getOrders()) {
			productsToBeDelivery.addAll(getOrderProcessedProducts(order));
		}
		
		ArrayList<Drone> drone = Drone.createDefault(motherOfAllWarehouses.getNrDrones());
		
		for(step=0; step < motherOfAllWarehouses.getDeadLineOfSimulation(); step++) {

		}
		
	}
	
	public static int computeDistance(Location a, Location b) {
		double d = Math.sqrt(Math.pow(Math.abs(a.getCol()-b.getCol()), 2) + Math.pow(Math.abs(a.getRow()-b.getRow()), 2) );
		
		return (int)Math.ceil(d);
	}
	
	public static ArrayList<Product> getOrderProcessedProducts (Order order) {
		
		ArrayList<Product> products = order.getProductsToBeDelibered();
		 Set<Integer> set = new HashSet<Integer>();
		 for (Product product : products) {
			 set.add(product.getType());
		 }
		 
		 ArrayList<Product> rp= new ArrayList<Product>();
		 for (Integer pr : set) {
			Product p =  new Product(pr.intValue());
			p.setQuantity(Utils.getNumberOfProduct(products, pr.intValue()));
			p.setLocationToBeDeliver(order.getLocationToBeDelivered());
			rp.add(p);
		 }

	
		 
		 return rp;
	}
	

}
