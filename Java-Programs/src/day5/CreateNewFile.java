package day5;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateNewFile {

	public static void main(String[] args) {
		
		//Approach 1: Using File.
		
		String path = "C:\\Users\\Admin\\Desktop\\Selenium-Java\\Java-Programs\\src\\day5\\sample.text";
		File file  = new File(path);
		
		try {
			
			boolean flag = file.createNewFile();
			
			if(flag) {
				
				System.out.println("File created successfully!!!");
			}
			else {
				
				System.out.println("File is already present!!!");
			}
			System.out.println(file.getAbsolutePath());
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error message is "+e);
			e.printStackTrace();
		}
		
		
		//Approach 2: FileOutputStream along with Scanner class
		
		try {
			
			Scanner scan =  new Scanner(System.in);
			System.out.println("Enter the file name with location path:");
			String pathLocation = scan.nextLine();
			
			FileOutputStream fileOutput = new FileOutputStream(pathLocation, true);
			
			String content = scan.nextLine();
			
			byte[] contentInBytes = content.getBytes();
			
			fileOutput.write(contentInBytes);
			fileOutput.close();
			
			scan.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error message is "+e);
			e.printStackTrace();
		}
		
		//Approach 3: Using Java nio package
		
		try {
			
			Path newFileLocation = Paths.get("C:\\Users\\Admin\\Desktop\\Selenium-Java\\Java-Programs\\src\\day5\\sample.pdf");
			
			Path newFilePath     = Files.createFile(newFileLocation);
			
			System.out.println("new file created at"+ newFilePath);

			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error message is "+e);
			e.printStackTrace();
		}
 		
	}
}