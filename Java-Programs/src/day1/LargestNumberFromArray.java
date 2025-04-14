package day1;

import java.util.Scanner;

public class LargestNumberFromArray {

	public static void main(String[] args) {

		System.out.println("W.A.P to find the largest number from an array number which is given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array.");
		int size = scan.nextInt();
		System.out.println("Size of an array is "+size);
		int[] input = new int[size];
		System.out.println("**** Enter the value ****");
		for(int i=0; i<size; i++) {
			
			input[i] = scan.nextInt();
		}
		int max = input[0];
		
		for(int i = 1; i < input.length; i++) {
			
			if(max < input[i]) {
				max = input[i];
			}
		}
		
		System.out.println("Largest Number from an array is "+max);
		
		scan.close();
	}
}