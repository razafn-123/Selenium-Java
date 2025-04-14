package day2;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		System.out.println("W.A.P to swap the 2 numbers and that will be given by user at runtime!!!");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int a = scan.nextInt();
		System.out.println(a);
		
		System.out.println("Enter the second number:");
		int b = scan.nextInt();
		System.out.println(b);
		
		System.out.println("Value of a = "+a+" & Value of b = "+b);
		
		System.out.println("Swapping of 2 numbers Using Third Variable");
		
		int temp = a;
		
		a = b;
		
		b = temp;
		
		System.out.println("Value of a = "+a+" & Value of b = "+b);
		
		System.out.println("Swapping of 2 numbers without Using Third Variable & Using Addition and Subtraction");
		
		a = a + b;
		
		b = a - b;
		
		a = a - b;
	
		System.out.println("Value of a = "+a+" & Value of b = "+b);
		
		System.out.println("Swapping of 2 numbers without Using Third Variable & Using XOR Operator");

		a = a ^ b;
		
		b = a ^ b;
		
		a = a ^ b;
	
		System.out.println("Value of a = "+a+" & Value of b = "+b);
		
		scan.close();
	}
}