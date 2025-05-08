package day5;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileFromFileReader {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\Admin\\Desktop\\Selenium-Java\\Java-Programs\\src\\day5\\input.txt";
		
		FileReader file = null;
		
		try {
			
			file = new FileReader(path);
			
			System.out.println("File content is ");
			
			int i = 0;
			
			while((i = file.read()) != -1) {
				
				System.out.print((char)i);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		finally {
			
			try {
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
