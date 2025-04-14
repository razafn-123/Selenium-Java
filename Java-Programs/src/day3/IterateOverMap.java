package day3;

import java.util.HashMap;
import java.util.Map;

public class IterateOverMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Raza", 30);
		
		map.put("Siraj", 29);
		
		map.put("Naved", 28);
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
	}
}
