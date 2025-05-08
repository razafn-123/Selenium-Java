package day4;

public class StringLiteralNObjects {

	public static void main(String[] args) {

		String s1 = "Raza Ahmed Pathan"; // stored in String Constant Pool.
		
		String s2 = new String("Raza Ahmed Pathan"); // stored in Heap Memory.
		
		System.out.println(s1 == s2); // compare string address references.
		
		System.out.println(s1.equals(s2)); // compare string values.
		
	}

}