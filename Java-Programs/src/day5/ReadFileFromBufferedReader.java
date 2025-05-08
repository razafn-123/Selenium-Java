package day5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileFromBufferedReader {

	public static void main(String[] args) {

		String path = "C:\\Users\\Admin\\Desktop\\Selenium-Java\\Java-Programs\\src\\day5\\input.txt";
		
		BufferedReader buffReader  = null;
		
		try {

			File file  = new File(path);
			buffReader = new BufferedReader(new FileReader(file));
			
			int i = 0;
			
			while((i=buffReader.read()) != -1) {
			
				System.out.print((char) i);
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			
			try {
				
				buffReader.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}