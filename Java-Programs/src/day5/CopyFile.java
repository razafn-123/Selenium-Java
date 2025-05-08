package day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

	public static void main(String[] args) {

		
		String inputFileName    = "C:\\Users\\Admin\\Desktop\\Selenium-Java\\Java-Programs\\src\\day5\\input.txt";
		
		String outputFileName   =  "C:\\Users\\Admin\\Desktop\\Selenium-Java\\Java-Programs\\src\\day5\\output.txt";
		
		try {
			copyFile(inputFileName, outputFileName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void copyFile(String inputFile, String outputFile) throws Exception {
		
		File inputFileData  = new File(inputFile);
		File outputFileData = new File(outputFile);
		
		FileInputStream  fileInput   = new FileInputStream(inputFileData);
		FileOutputStream fileOutput  = new FileOutputStream(outputFileData);
		try {
			
			System.out.println(fileInput.available());
			int i = 0;
			
			while((i = fileInput.read()) != -1) {
				
				fileOutput.write(i);
			}
		}
		catch(Exception e) {
			
			System.out.println("error message is "+e);
		}
		
		finally {
			
			if(fileInput !=null) {
				
				fileInput.close();
			}
			if(fileOutput!=null) {
				
				fileOutput.close();
				
			}
			
		}
		
		
	}
}
