package day5;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class ReadFileUsingNIO {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\Admin\\Desktop\\Selenium-Java\\Java-Programs\\src\\day5\\input.txt";
		
		try {
			
			List<String> list = Files.readAllLines(Paths.get(path),StandardCharsets.UTF_8);
			
			Iterator<String> iterator = list.iterator();
			
			while(iterator.hasNext()) {
				
				System.out.println(iterator.next());
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}