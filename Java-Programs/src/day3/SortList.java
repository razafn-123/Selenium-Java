package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,34,5,10,99,345));
		
		Collections.sort(list);
		
		System.out.print(list);
	}
}
