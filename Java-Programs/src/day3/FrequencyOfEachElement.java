package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElement {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,4,5, 6, 4, 3, 2,6,7,7,7,7,9,0));
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i<list.size(); i++) {
			
			map.put(list.get(i), map.getOrDefault(list.get(i), 0)+1);
		}
		
		//Iterate over Map
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			
			System.out.println("number is "+entry.getKey()+" & Frequency is "+entry.getValue());
		}
	}
}