package com;

import java.io.IOException;

import models.InputDataObject;

import utils.ReadFromFile;
import utils.WriteToFile;

public class Main {

	public static final String pathToIntFolder = "C:\\Users\\Bogdan\\Desktop\\facultate\\google hash code\\git\\HashCode\\src\\in";
	public static final String pathToIntFolderAndrei = "C:\\Users\\AncientMachine\\Desktop\\hashCode\\probleme\\HashCode\\src\\in";
	
	public static void main(String[] args) throws IOException {
		int step = 0; 
		InputDataObject busyDay = new InputDataObject(pathToIntFolder, "busy_day");
		InputDataObject motherOfAllWarehouses = new InputDataObject(pathToIntFolderAndrei, "mother_of_all_warehouses");
		InputDataObject redundancy = new InputDataObject(pathToIntFolder, "redundancy");
		
		for(step=0; step < 100; step++) {
			
		}
		
	}

}
