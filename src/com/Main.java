package com;

import java.io.IOException;
import java.util.ArrayList;

import models.Command;
import models.InputDataObject;
import models.Command.CommandType;

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
//		InputDataObject motherOfAllWarehouses = new InputDataObject(pathToIntFolderAndrei, "mother_of_all_warehouses");
		InputDataObject redundancy = new InputDataObject(pathToIntFolder, "redundancy");
		
		for(step=0; step < 100; step++) {
			
		}
		
	}
	
}
