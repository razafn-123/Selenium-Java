package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,8));
		
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,9,10,5,6,8));
		
		ArrayList<Integer> intersection = intersectedList(list1, list2);
		
		System.out.print(intersection);
		
	}
	
	
	public static ArrayList<Integer> intersectedList(ArrayList<Integer> list1, ArrayList<Integer> list2){
		
		HashSet<Integer> set1 = new HashSet<>(list1);
		
		HashSet<Integer> set2 = new HashSet<>(list2);
		
		set1.retainAll(set2);
	
		return new ArrayList<>(set1);
	}
}