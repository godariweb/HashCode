package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileUtils {

	public static char[][] readMatrixFromFile(){
		
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\Bogdan\\Desktop\\facultate\\isp\\tema3\\hash\\src\\main\\learn_and_teach.in"));
			String line = br.readLine(); 
			
			int n = Integer.parseInt(line.split(" ")[0]);
			int m = Integer.parseInt(line.split(" ")[1]);
			
			
			char [][] x = new char[n][m];
			
			int lineIndex = 0;
			
			while ((line = br.readLine()) != null) {
				for(int i = 0; i < line.length(); i++) {
					x[lineIndex][i] = line.charAt(i);
				}
				lineIndex++;
			}
			
			br.close();
			
			return x;
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;

	}
}
