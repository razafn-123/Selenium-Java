package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedlist {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,3,5,7));

		List<Integer> list2 = new ArrayList<>(Arrays.asList(2,4,6,8,9,10));
		
		List<Integer> mergedlist = mergeTwoSortedList( list1, list2);
		
        System.out.println("Merged ArrayList: " + mergedlist);

	}
	
	public static List<Integer> mergeTwoSortedList( List<Integer> list1, List<Integer> list2 ){
		
		List<Integer> mergeList = new ArrayList<Integer>();
		
		int i = 0, j = 0;
		
		while(i < list1.size() && j < list2.size()) {
			
			if(list1.get(i) < list2.get(j)) {
				
				mergeList.add(list1.get(i));
				
				i++;
			}
			else {
				
				mergeList.add(list2.get(j));
				
				j++;
			}
			
		}
		
		while(i < list1.size()) {
			
			mergeList.add(list1.get(i));
			
			i++;
		}
		
		while(j < list2.size()) {
			
			mergeList.add(list2.get(j));
			
			j++;
		}
		
		return mergeList;
	}

}
