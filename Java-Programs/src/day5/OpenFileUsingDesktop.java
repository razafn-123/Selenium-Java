package day5;

import java.awt.Desktop;
import java.io.File;

public class OpenFileUsingDesktop {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\Admin\\Desktop\\Selenium-Java\\Java-Programs\\src\\day5\\input.txt";
		
		try {
		
			File file = new File(path);
			
			if(!Desktop.isDesktopSupported()) {
				
				System.out.println("Not Supported for this Desktop!!!");
			}
			
			Desktop desktop = Desktop.getDesktop();
			
			if(file.exists()) {
				
				desktop.open(file);
			}
			
			
		} catch (Exception e) {

			e.printStackTrace();
		
		}
	}
}