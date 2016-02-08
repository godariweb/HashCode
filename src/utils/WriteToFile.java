package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriteToFile {
	
	/**
	 * @var String pathToFile
	 */
	private String pathToFile = "";
	
	/**
	 * @param pathToFile
	 */
	public WriteToFile(String pathToFile) {
		this.pathToFile = pathToFile;
	}
	
	/**
	 * @param texToWrite
	 * @throws IOException
	 */
	public void writeFile(String[] texToWrite) throws IOException{
		writeToFile(this.pathToFile, texToWrite);
	}
	
	/**
	 * @throws IOException
	 */
	private  void writeToFile(String pathToFile, String[] texToWrite) throws IOException {
		File fout = new File(pathToFile);
		FileOutputStream fos = new FileOutputStream(fout);
	 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
	 
		for (int i = 0; i < texToWrite.length; i++) {
			bw.write(texToWrite[i]);
			bw.newLine();
		}
	 
		bw.close();
	}

	/**
	 * @return String
	 */
	public String getPathToFile() {
		return pathToFile;
	}	
	
}
