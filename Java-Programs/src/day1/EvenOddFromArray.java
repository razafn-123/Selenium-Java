package day1;

import java.util.Scanner;

public class EvenOddFromArray {

	public static void main(String[] args) {
		
		System.out.println("W.A.P to get the even and odd number from an array which is given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array!!!");
		int size = scan.nextInt();
		System.out.println(size);
		int[] number  = new int[size];
		int evenSize = 0;
		int oddSize = 0;
		System.out.println("Enter the data for the array");
		for(int i = 0; i < size; i++) {
			
			number[i] = scan.nextInt();
			
			if(number[i] % 2 == 0) {
				
				evenSize++;
			}
			else {
				
				oddSize++;
			}
		}
		System.out.println("Display the array data");
		
		for(int i = 0; i< size; i++) {
			
			System.out.println(number[i]);
		}
		
		int[] evenArray = new int[evenSize];
		
		int[] oddArray = new int[oddSize];

		for(int i = 0, j = 0, k = 0; i < size; i++) {
			
			if(number[i] % 2 == 0) {
				
				evenArray[j] = number[i];
				j++;
			}
			else {
				oddArray[k] = number[i];
				k++;
			}
		}
		
		
		System.out.println("Display the even data of array");
		
		
		for(int i = 0; i < evenSize; i++) {
			
			System.out.println(evenArray[i]);

		}
		
		System.out.println("Display the odd data of array");
		
		
		for(int i = 0; i < oddSize; i++) {
			
			System.out.println(oddArray[i]);
		}

		scan.close();
	}
}