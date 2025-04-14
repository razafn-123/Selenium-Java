package day3;

import java.util.Arrays;

public class DisplayArrayInAscendingOrder {

	public static void main(String[] args) {
		
		int[] list = {1,2,3,6,9,19,90,1,4,7,9,200,67,23,98,123,9,12};
		
		Arrays.sort(list);
		
		for(int i = 0; i< list.length; i++) {
			
			System.out.print(list[i]+", ");
		}
	}
}