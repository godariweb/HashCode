package com;
import java.io.IOException;

import utils.ReadFromFile;
import utils.WriteToFile;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		// decalring input and output file path
		String inputFilePath = "C:\\Users\\Kristo\\workspace\\HashCode\\files\\logo.in";
		String outPutFilePath = "C:\\Users\\Kristo\\workspace\\HashCode\\files\\logo.out";
		
		// ReadFromFile and  WriteToFile object initialization
		ReadFromFile  readFromFileObject = new ReadFromFile(inputFilePath);
		WriteToFile   writeToFileObject  = new WriteToFile(outPutFilePath);
		
		// Reading from file and outputing the result
		String[] fileContent = readFromFileObject.readFile();		
		for(int i=0; i< fileContent.length; i++){
			System.out.println(fileContent[i]);
		}
		
		// Writing the above output to a file
		writeToFileObject.writeFile(fileContent);
	}

}
