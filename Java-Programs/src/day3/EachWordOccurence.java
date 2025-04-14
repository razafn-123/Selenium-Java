package day3;

import java.util.HashMap;
import java.util.Map;

public class EachWordOccurence {

	public static void main(String[] args) {
		
		String str = "Alice is girl and Bob is boy";
		
		String[] word = str.split("\\s");
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i< word.length; i++) {
			
			if(map.containsKey(word[i])) {
				
				map.put(word[i], map.get(word[i])+1);
			}
			else {
			
				map.put(word[i], 1);
			}
		}
		
		System.out.println(map);
	}
}