package day5;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteDataIntoTxtFile {

	public static void main(String[] args) throws Exception {
		
		String filePath = "C:\\Users\\Admin\\Desktop\\Selenium-Java\\Java-Programs\\src\\day5\\write.txt";
		
		FileWriter write = new FileWriter(filePath);
		
		BufferedWriter br = new BufferedWriter(write);
		
		br.write("THis is Java Program \n");
		br.write("THis is Java Program \n");
		br.write("THis is Java Program");
		
		br.close();
		
	}
}
