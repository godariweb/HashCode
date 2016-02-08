package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadFromFile {
	
	/**
	 * @var String pathToFile
	 */
	private String pathToFile = "";
	
	/**
	 * @param pathToFile
	 * @param resultType
	 */
	public ReadFromFile(String pathToFile){
		this.pathToFile = pathToFile;
	}
	
	/**
	 * @return array
	 * @throws IOException
	 */
	public  String[] readFile() throws IOException{
		return readLines(this.pathToFile);
	}
	
	
	/**
	 * @param String filename
	 * @return array 
	 * @throws IOException
	 */
	private String[] readLines(String filename) throws IOException   
    {  
        FileReader fileReader = new FileReader(filename);  
          
        BufferedReader bufferedReader = new BufferedReader(fileReader);  
        List<String> lines = new ArrayList<String>();  
        String line = null;  
          
        while ((line = bufferedReader.readLine()) != null)   
        {  
            lines.add(line);  
        }  
          
        bufferedReader.close();  
          
        return lines.toArray(new String[lines.size()]);  
    }

	/**
	 * @return String
	 */
	public String getPathToFile() {
		return pathToFile;
	}
	
}
