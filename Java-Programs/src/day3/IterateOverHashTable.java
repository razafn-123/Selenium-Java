package day3;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class IterateOverHashTable {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> table = new Hashtable<>();
		table.put("Raza", 30);
		table.put("Siraj", 29);
		table.put("Naved", 28);
		table.put("Faizan", 30);
		table.put("Salman", 29);
		
		//Iterate over Hashtable
		Enumeration<String> keys = table.keys();
		while(keys.hasMoreElements()) {
			
			String key = keys.nextElement();
			
			System.out.println("Keys is "+key+"  & Value is "+table.get(key));
			
		}
		
		//Iterate over map
		
		for(Map.Entry<String, Integer> entry: table.entrySet()) {
			
			System.out.println("Keys is "+entry.getKey()+" & Value is "+entry.getValue());
		}
		
		
		
		
		
		
	}
}