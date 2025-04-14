package day2;

import java.util.Scanner;

public class TriangleClassifier {

	public static void main(String[] args) {
		
		/*
		 * Write a program that classifies a triangle based on its side lengths. 
		 * Given three input values representing the lengths of the sides, 
		 * determine if the triangle is equilateral (all sides are equal), 
		 * isosceles (exactly two sides are equal), or scalene (no sides are equal). 
		 * Use an if-else statement to classify the triangle.
		 * 
		 */
		
		System.out.println("W.A.P to find the classification of triangle and enter the side of triangle and that will be given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first side:");
		int side1 = scan.nextInt();
		System.out.println(side1);
		System.out.println("Enter the second side:");
		int side2 = scan.nextInt();
		System.out.println(side2);
		System.out.println("Enter the third side:");
		int side3 = scan.nextInt();
		System.out.println(side3);
		
		if((side1 == side2) && (side1 ==side3)) {
		
			System.out.print("Equilateral triangle");
		}
		else if((side1 == side2) || (side1 ==side3) || (side2 == side3)) {
		
			System.out.print("Isosceles triangle");
		}
		else {
			
			System.out.print("Scalene triangle");
		}
		
		scan.close();
	}

}