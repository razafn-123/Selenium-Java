package day1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		System.out.println("W.A.P to display fibonacci series which is given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for which you want their series length!");
		int length = scan.nextInt();
		System.out.println(length);
		int f1 = 0, f2 = 1, f3 = f1 + f2;
		System.out.print(f1+" "+f2+" ");
		length = length -2;
		while(length >= 0) {
			
			System.out.print(f3+" ");
			
			f1 = f2;
			f2 = f3;
			
			f3 = f1 + f2;
			length--;
		}
		
		scan.close();
	}
}