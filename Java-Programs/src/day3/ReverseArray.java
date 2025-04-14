package day3;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] list = {1,2,3,4,5,9,8,8,8,9,9,4,2,1,5};
		
		int[] reverselist = new int[list.length];
		
		for(int i = list.length - 1, j = 0; i>= 0; i--, j++) {
			
			reverselist[j] = list[i];
			
			System.out.print(reverselist[j]+", ");
		}
	}
}