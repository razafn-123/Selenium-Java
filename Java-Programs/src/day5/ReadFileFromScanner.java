package day5;

import java.io.File;
import java.util.Scanner;

public class ReadFileFromScanner {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\Admin\\Desktop\\Selenium-Java\\Java-Programs\\src\\day5\\input.txt";
		
		try {
		
			File file = new File(path);
			
			Scanner scan= new Scanner(file);
			
			System.out.println("File content is ");
			
			while(scan.hasNextLine()) {
				
				System.out.print(scan.nextLine()+ " \n");
			}
			
			scan.close();
			
		} catch (Exception e) {
			
			
		}
	}
}