package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class MostFrequentElement {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,4,4,4,5,6,6,6,7,7,9));
		
		int maxFrequency = mostFrequentElement(list);
		
		System.out.print(maxFrequency);
			
	}
	
	public static int mostFrequentElement(ArrayList<Integer>  list){
		
		Map<Integer, Integer> frequencyMap = new HashMap<>();
				
		for(int num : list) {
			
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}
	
		return Collections.max(frequencyMap.entrySet(), Map.Entry.comparingByValue()).getKey();
	}
	
}