package day5;

import java.io.File;
import java.util.Arrays;

public class PrintFileName {

	public static void main(String[] args) {
		
		String DownloadDirectoryName = "C:\\Users\\Admin\\Downloads";
		
		printFileName(DownloadDirectoryName);
		
	}
	
	public static void printFileName(String path) {
		
		File file = new File(path);
		
		File[] dirDetails = file.listFiles();
		
		Arrays.sort(dirDetails);
		
		for(File f : dirDetails) {
			
			if(f.isFile()) {
				
				System.out.println("File Name is "+f.getName()+" & its path is "+f.getAbsolutePath());
			}
			else if(f.isDirectory()) {
			
				System.out.println("Directory Name is "+f.getName()+" & its path is "+f.getAbsolutePath());

			}
			else {
				
				System.out.println("UnKnown Name is "+f.getName()+" & its path is "+f.getAbsolutePath());

			}
		}
	}
}