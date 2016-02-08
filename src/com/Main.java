package com;
import java.io.IOException;

import utils.ReadFromFile;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		String pathToFile = "C:\\Users\\Kristo\\workspace\\HashCode\\files\\logo.in";
		
		ReadFromFile  readFromFileObject = new ReadFromFile(pathToFile);		
		String[] fileContent = readFromFileObject.readFile();
		
		for(int i=0; i< fileContent.length; i++){
			System.out.println(fileContent[i]);
		}						
		
	}

}
