package com;
import java.io.IOException;

import utils.ReadFromFile;
import utils.WriteToFile;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		String inputFilePath = "C:\\Users\\Kristo\\workspace\\HashCode\\files\\logo.in";
		String outPutFilePath = "C:\\Users\\Kristo\\workspace\\HashCode\\files\\logo.out";
		
		ReadFromFile  readFromFileObject = new ReadFromFile(inputFilePath);
		WriteToFile   writeToFileObject  = new WriteToFile(outPutFilePath);
		
		String[] fileContent = readFromFileObject.readFile();		
		for(int i=0; i< fileContent.length; i++){
			System.out.println(fileContent[i]);
		}
		
		writeToFileObject.writeFile(fileContent);
	}

}
