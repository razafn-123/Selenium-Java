package day2;

import java.util.Scanner;

public class LeapYearChecker {

	public static void main(String[] args) {

		System.out.println("W.A.P to check whether entered year is leap year or not and that will be given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = scan.nextInt();
		System.out.println(year);
		
		if((year % 100 != 0 && year % 4 ==0) || (year % 400 == 0)) {
			
			System.out.println(year+" is Leap Year!!!");
		}
		else {
			
			System.out.println(year+" is not a Leap Year!!!");
		}
		scan.close();
	}
}