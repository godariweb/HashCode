package utils;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import models.Command;

public class WriteToFile {
	
	String pathToOutputFolder = "";
	
	public WriteToFile(String pathToOutputFolder) {
		this.pathToOutputFolder = pathToOutputFolder;
	}
	
	public  void writeToFile(String outPutFileName, ArrayList<Command> commands) throws IOException {
		PrintWriter writer = new PrintWriter(pathToOutputFolder + "\\" + outPutFileName + ".out");
		
		writer.print(commands.size());
		writer.print('\n');
		
		for (int i = 0; i < commands.size(); i++) {
			writer.print(commands.get(i).toString());
			writer.print('\n');
		}
		
		writer.close();
	}
	
}
