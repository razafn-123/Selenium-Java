package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConvertlistToSet {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
		
		for(Integer l: list) {
			
			System.out.print(l);
		}
		System.out.println("\n-----------------------------------");
		
		Set<Integer> set = new HashSet<>(list);
		
		for(Integer l: set) {
			
			System.out.print(l);
		}
	}
}