package day3;

import java.util.HashSet;

public class RemoveDuplicateFromList2 {

	public static void main(String[] args) {

		int[] list = {1,2,3,4,5,9,8,8,8,9,9,4,2,1,5};
		
		HashSet<Integer> seen = new HashSet<>();
		
		HashSet<Integer> duplicate = new HashSet<>();
		
		for(int number : list) {
			
			if(!seen.add(number)) {
				
				duplicate.add(number);
			}
		}
		
		System.out.println(duplicate);	
	}
}