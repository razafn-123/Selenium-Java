package day3;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class IterateThroughLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		Collections.addAll(list, 1,2,3,4,5,6,7,8,9,10);
		
		//iteration through iterator
		
		Iterator<Integer> iterate = list.iterator();
		while(iterate.hasNext()) {
			
			System.out.print(iterate.next());
		}
		
		System.out.println();
		
		//iterate using enhanced for loop
		
		for(Integer num : list) {
			
			System.out.print(num);
		}
		
		System.out.println();
		
		//iterate using loop with index
		for(int i=0; i<list.size(); i++) {
			
			System.out.print(list.get(i));
		}
	}
}