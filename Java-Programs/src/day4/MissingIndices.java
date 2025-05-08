package day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MissingIndices {

	public static void main(String[] args) {

		String input = "[()]([()]";
		
		List<Integer> list = new ArrayList<>();
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0 ; i < input.length(); i++) {
			
			char brackets = input.charAt(i);
			
			if(brackets == '(') {
				
				stack.push(i);
			}
			else if(brackets == ')' && !stack.isEmpty()) {
				
				stack.pop();
			}	
		}
		
		while(!stack.isEmpty()) {
			
			list.add(stack.pop());
		}
		
		
		System.out.println("Missing Indices: "+ list);
		
	}

}
