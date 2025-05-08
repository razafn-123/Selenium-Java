package day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingFileInputStream {

	public static void main(String[] args) {


		String path = "C:\\Users\\Admin\\Desktop\\Selenium-Java\\Java-Programs\\src\\day5\\input.txt";
		
		FileInputStream fileInput = null;
		try {
		
			File file = new File(path);
			
			fileInput = new FileInputStream(file);
			
			System.out.println("File content is ");
			
			int i = 0;
			
			while((i = fileInput.read()) != -1) {
				
				System.out.print((char)i);
			}
			
		}catch (Exception e) {

			e.printStackTrace();
		}
		finally {
	
			try {
				fileInput.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
