package com;

import java.io.IOException;

import utils.ReadFromFile;
import utils.WriteToFile;

public class Main {

	public static void main(String[] args) throws IOException {
		testReadFromFileMethods();
	}

	public static void testReadFromFileMethods() throws IOException {
		// decalring input and output file path
		String inputFilePath = "C:\\Users\\Kristo\\workspace\\HashCode\\files\\logo.in";

		// ReadFromFile object initialization
		ReadFromFile readFromFileObject = new ReadFromFile(inputFilePath);

		// Test that readFile function works 
		String[] fileContent = readFromFileObject.readFile();
		for (int i = 0; i < fileContent.length; i++) {
			System.out.println(fileContent[i]);
		}
		System.out.println("\n\n");

		//Test that readLineAsString function works
		int lineNumber = 1;
		System.out.println(readFromFileObject.readLineAsString(lineNumber));
		System.out.println("\n\n");

		// Test that readLineAsCharArray function works
		int lineNumber2 = 2;
		char[] fileCharContent = readFromFileObject.readLineAsCharArray(lineNumber2);
		for (int i = 0; i < fileCharContent.length; i++) {
			System.out.println(fileCharContent[i]);
		}
		System.out.println("\n\n");

		// Test that readColumnAsString function works
		int columnNumber = 11;
		System.out.println(readFromFileObject.readColumnAsString(columnNumber));
		System.out.println("\n\n");

		// Test that readColumnAsCharArray function works
		int columnNumber2 = 11;
		char[] fileCharContent2 = readFromFileObject.readColumnAsCharArray(columnNumber2);
		for (int i = 0; i < fileCharContent2.length; i++) {
			System.out.println(fileCharContent2[i]);
		}
		System.out.println("\n\n");

		//Test that readSpecificElement function works
		int seLineNumber = 0;
		int seColumnNumber = 8;
		System.out.println(readFromFileObject.readSpecificElement(seLineNumber, seColumnNumber));
		System.out.println("\n\n");

		// Test that readSpecificContentBlock function works
		int startLine = 5;
		int endLine = 10;
		int startColumn = 10;
		int endColumn = 30;

		char[][] blockFileContent = readFromFileObject.readSpecificContentBlock(startLine, endLine, startColumn,
				endColumn);
		for (int i = 0; i < blockFileContent.length; i++) {
			char[] contentRow = blockFileContent[i];
			String finalRow = "";
			for (int j = 0; j < contentRow.length; j++) {
				finalRow += contentRow[j];
			}
			System.out.println(finalRow);
		}
	}

}
