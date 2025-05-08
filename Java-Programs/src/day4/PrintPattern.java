package day4;

import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number would like to print how many rows");
		int number = scan.nextInt();
		
		pattern1(number);

		System.out.println();
		
		pattern2(number);
		
		scan.close();
	}
	
	public static void pattern1(int n) {
		
		/*
		 * 1
		 * 1 2 
		 * 1 2 3
		 * 1 2 3 4
		 * 1 2 3 4 5
		 * 
		 */
		
		
		for(int i = 1 ; i <= n ; i++) {
			
			for(int j = 1; j <=i ; j++) {
				
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void pattern2(int n) {
		
		
		/*
		 * 1
		 * 2 2 
		 * 3 3 3
		 * 4 4 4 4
		 * 5 5 5 5 5
		 * 
		 */
		
		for(int i = 1 ; i <= n ; i++) {
			
			for(int j = 1; j <=i ; j++) {
				
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}

}
