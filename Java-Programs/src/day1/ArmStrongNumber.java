package day1;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {

		System.out.println("W.A.P to check whether number is ArmStrong or not which is given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for which you want to check whether number is ArmStrong  or not!");
		int input = scan.nextInt();
		System.out.println(input);
		int number = input;
		int armStrong = 0;
		while(number > 0) {
			
			int remainder = number % 10;
			
			armStrong = armStrong + remainder * remainder * remainder;
			
			number = number / 10;
			
		}
		
		if(armStrong == input) {
			
			System.out.println(input + " is an ArmStrong Number!!!");
			
		}
		else {
			
			System.out.println(input + " is not an ArmStrong Number!!!");

		}
		
		
		scan.close();
		
	}

}
