package day4;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInArray {

	public static void main(String[] args) {

		
		int[] list = {1,1,1,1,1,2,56,78,98,2,3,4,5,5,5,6,6,6,7,34852,4523,76,7,7,8,8,9,9,9,4,2,3,4,5,6,7,8,9,12,45,78,100};
		
		Map<Integer, Integer> map =new HashMap<>();
		
		for(int num : list) {
			
			if(map.containsKey(num)) {
				
				map.put(num, map.get(num)+1);
			}
			else {
				
				map.put(num, 1);
			}
		}
		
		System.out.println(map);
		
		
		for(Map.Entry<Integer,Integer> entry: map.entrySet() ) {
			
			if(entry.getValue() > 1)
				
				System.out.println("Number: "+entry.getKey()+" and their Occurrences : "+entry.getValue());
			
		}
		
	}
}