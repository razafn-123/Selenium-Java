package day1;

import java.util.Scanner;

public class ArraySummation {

	public static void main(String[] args) {
		
		System.out.println("W.A.P to perform summation of array number which is given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array.");
		int size = scan.nextInt();
		System.out.println("Size of an array is "+size);
		int[] input = new int[size];
		System.out.println("**** Enter the value ****");
		for(int i=0; i<size; i++) {
			
			input[i] = scan.nextInt();
		}
		System.out.println("perform summation of an array");
		
		int sum = 0;
		
		for(int i=0; i<size; i++) {
			
			sum += input[i];
		}
		
		System.out.println("Total Value is "+ sum);
		
		scan.close();
	}
}