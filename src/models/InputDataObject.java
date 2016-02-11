package models;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import utils.ReadFromFile;

public class InputDataObject {

	int nrRows;								// >= 1 <=10000
	int nrColumns;							// >= 1 <=10000
	int nrDrones;							// >= 1 <=1000
	int deadLineOfSimulation;				// >= 1 <=1000000
	int maxLoadOfDrone;						// >= 1 <=10000
	
	int numberOfDifferentPrTypes;			// >= 1 <=10000
	int [] weightsOfProductTypes;			//1 <= weight <= maxLoadOfDrone 
	
	int numberOfWareHouses;			// >= 1 <=10000
	ArrayList<Warehouse> warehouses;
	
	int numberOfOrders;	
	ArrayList<Order> orders;
	
	public InputDataObject(String pathToInputFolder, String fileName) {
		
		try {
			ReadFromFile rff = new ReadFromFile(pathToInputFolder +  "\\" + fileName + ".in");
			
			String[] firstLine = rff.getFileContent()[0].split(" ");
			
			nrRows = Integer.parseInt(firstLine[0]);
			nrColumns = Integer.parseInt(firstLine[1]);
			nrDrones = Integer.parseInt(firstLine[2]);
			deadLineOfSimulation = Integer.parseInt(firstLine[3]);
			maxLoadOfDrone = Integer.parseInt(firstLine[4]);
			
			numberOfDifferentPrTypes = Integer.parseInt(rff.getFileContent()[1]);
			
			String [] thirdLine = rff.getFileContent()[0].split(" ");
			
			weightsOfProductTypes = new int[thirdLine.length];
			
			for (int i = 0; i < thirdLine.length; i++) {
				weightsOfProductTypes[i] = Integer.parseInt(thirdLine[i]);
			}
			
			numberOfWareHouses = Integer.parseInt(rff.getFileContent()[3]);			
			warehouses = new ArrayList<Warehouse>();
			
			int whereWareHousesEnd =  2*numberOfWareHouses + 4;
			
			for(int i = 4; i < 2*numberOfWareHouses + 4; i+=2) {
				String location = rff.getFileContent()[i];
				
				Location wareHLocation = new Location(Integer.parseInt(location.split(" ")[0]), Integer.parseInt(location.split(" ")[1]));
				
				String[] products = rff.getFileContent()[i+1].split(" ");
				
				ArrayList<Product> productList = new ArrayList<Product>();
				
				for (int j = 0; j < products.length; j++) {
					
					for(int k = 0; k < Integer.parseInt(products[j]); k++) {
						productList.add(new Product(j));
					}
				}
				
				warehouses.add(new Warehouse(wareHLocation, productList));
			}
			
			numberOfOrders = Integer.parseInt(rff.getFileContent()[whereWareHousesEnd]);
			
			int whereOrdersEnd = numberOfOrders = 3*numberOfOrders + whereWareHousesEnd + 1;
			
			
			
			for(int i = whereOrdersEnd + 1; i < whereOrdersEnd; i+=3) {
				String toBeDelivered = rff.getFileContent()[i];
				Location locationToBeDelivered = new Location(Integer.parseInt(toBeDelivered.split(" ")[0]), Integer.parseInt(toBeDelivered.split(" ")[1]));
			
				int orderProductsCounts = Integer.parseInt(rff.getFileContent()[i+1]);
				String[] productsWithType = rff.getFileContent()[i+2].split(" ");
				
				ArrayList<Product> orderProducts = new ArrayList<Product>();
				
				for(int j = 0; j < orderProductsCounts; i=j++) {
					orderProducts.add(new Product(Integer.parseInt(productsWithType[j])));
				}
				
				orders.add(new Order(locationToBeDelivered, orderProducts));
			}
						
			System.out.println(rff.getFileContent()[0]);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
