package day5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileFromTxtFile {

	public static void main(String[] args) throws Exception {
		
		String filePath = "C:\\Users\\Admin\\Desktop\\Selenium-Java\\Java-Programs\\src\\day5\\input.txt";
		
		//Approach 1: Using FileReader & BufferedReader Class
		System.out.println("Approach 1: ");
		
		FileReader fr = new FileReader(filePath);
		
		BufferedReader br = new BufferedReader(fr);
		
		String str = null;
		
		while((str = br.readLine()) != null) {
			
			System.out.println(str);
		}
		
		//Approach 2: Using Scanner  & File
		
		System.out.println("Approach 2: ");
		
		File file = new File(filePath);
		
		Scanner sc =new Scanner(file);
		
		
		//Use Loop
		
		while(sc.hasNextLine()) {
			
			System.out.println(sc.nextLine());
		}

		sc.close();
			
		br.close();
	}
}
