package day2;

import java.util.Scanner;

public class RightNumericTriangle {

	public static void main(String[] args) {

		System.out.println("W.A.P to print right numeric triangle which is given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int input = scan.nextInt();
		System.out.println(input);
		for(int i = 0; i < input; i++) {
			
			for(int j = i ; j >= 0 ; j--) {
				
				System.out.print(j);
			}
			System.out.println();
		}
		scan.close();
	}
}