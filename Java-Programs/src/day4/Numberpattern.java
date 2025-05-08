package day4;

import java.util.Scanner;

public class Numberpattern {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number would like to print how many rows");
		int number = scan.nextInt();
		
		numberPattern(number);
		
		scan.close();
		
	}

	public static void numberPattern(int n) {
		
		
		/*
		 * 1
		 * 2 2 
		 * 3 
		 * 4 4 4 4
		 * 5 
		 * 6 6 6 6 6 6
		 * 7
		 * 8 8 8 8 8 8 8 8
		 * 9
		 * 
		 */
		
		for(int i = 1 ; i <= n ; i++) {
			
			for(int j = 1; j <=i ; j++) {
				
				if(i % 2 == 1) {
					
					System.out.print(i);
					break;
				}
				else {
			
					System.out.print(i + " ");
				}
			}	
			System.out.println();
		}
	}
}
