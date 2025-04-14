package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<>
		(Arrays.asList("apple","mango","banana","pineapple","apple","mango","custard"));
		
		Set<String> set = new HashSet<>(fruits);
		
		fruits.clear();
		
		fruits.addAll(set);
		
		System.out.println("List without duplicate elements are "+fruits);
		
	}
}