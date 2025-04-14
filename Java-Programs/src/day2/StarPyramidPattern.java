package day2;

import java.util.Scanner;

public class StarPyramidPattern {

	public static void main(String[] args) {

		System.out.println("W.A.P to print left numeric triangle which is given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int rows = scan.nextInt();
		System.out.println(rows);
		for(int i = 1; i <= rows; i++) {
		
			//Use for loop for Space.
			for(int j = 1; j <=(rows - i); j++) {
				
				System.out.print(" ");
			}
			
			//Use for loop for *
			for(int k = 1 ; k <=(2 * i - 1) ; k++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		scan.close();
	}

}
